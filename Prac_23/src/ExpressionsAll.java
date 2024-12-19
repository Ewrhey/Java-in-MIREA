public class ExpressionsAll {

    // Базовый интерфейс для выражений
    public interface Expression {
        double evaluate(double x, double y, double z);
    }

    // Класс для констант
    public static class Const implements Expression {
        private final double value;

        public Const(double value) {
            this.value = value;
        }

        @Override
        public double evaluate(double x, double y, double z) {
            return value;
        }
    }

    // Класс для переменных
    public static class Variable implements Expression {
        private final String name;

        public Variable(String name) {
            this.name = name;
        }

        @Override
        public double evaluate(double x, double y, double z) {
            return switch (name) {
                case "x" -> x;
                case "y" -> y;
                case "z" -> z;
                default -> throw new IllegalArgumentException("Unknown variable: " + name);
            };
        }
    }

    // Абстрактный класс для бинарных операций
    public static abstract class BinaryOperation implements Expression {
        protected final Expression left;
        protected final Expression right;

        public BinaryOperation(Expression left, Expression right) {
            this.left = left;
            this.right = right;
        }
    }

    // Класс для сложения
    public static class Add extends BinaryOperation {
        public Add(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        public double evaluate(double x, double y, double z) {
            return left.evaluate(x, y, z) + right.evaluate(x, y, z);
        }
    }

    // Класс для вычитания
    public static class Subtract extends BinaryOperation {
        public Subtract(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        public double evaluate(double x, double y, double z) {
            return left.evaluate(x, y, z) - right.evaluate(x, y, z);
        }
    }

    // Класс для умножения
    public static class Multiply extends BinaryOperation {
        public Multiply(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        public double evaluate(double x, double y, double z) {
            return left.evaluate(x, y, z) * right.evaluate(x, y, z);
        }
    }

    // Класс для деления
    public static class Divide extends BinaryOperation {
        public Divide(Expression left, Expression right) {
            super(left, right);
        }

        @Override
        public double evaluate(double x, double y, double z) {
            double divisor = right.evaluate(x, y, z);
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return left.evaluate(x, y, z) / divisor;
        }
    }

    // Класс для унарного минуса
    public static class Negate implements Expression {
        private final Expression operand;

        public Negate(Expression operand) {
            this.operand = operand;
        }

        @Override
        public double evaluate(double x, double y, double z) {
            return -operand.evaluate(x, y, z);
        }
    }

    // Парсер выражений
    public static class ExpressionParser {
        private String expression;
        private int index;

        public Expression parse(String expression) {
            this.expression = expression.replaceAll("\\s+", "");
            this.index = 0;
            return parseExpression();
        }

        private Expression parseExpression() {
            Expression result = parseTerm();
            while (index < expression.length() && (expression.charAt(index) == '+' || expression.charAt(index) == '-')) {
                char op = expression.charAt(index++);
                Expression right = parseTerm();
                if (op == '+') {
                    result = new Add(result, right);
                } else {
                    result = new Subtract(result, right);
                }
            }
            return result;
        }

        private Expression parseTerm() {
            Expression result = parseFactor();
            while (index < expression.length() && (expression.charAt(index) == '*' || expression.charAt(index) == '/')) {
                char op = expression.charAt(index++);
                Expression right = parseFactor();
                if (op == '*') {
                    result = new Multiply(result, right);
                } else {
                    result = new Divide(result, right);
                }
            }
            return result;
        }

        private Expression parseFactor() {
            if (index < expression.length() && expression.charAt(index) == '-') {
                index++;
                return new Negate(parseFactor());
            }
            if (index < expression.length() && expression.charAt(index) == '(') {
                index++;
                Expression result = parseExpression();
                if (index >= expression.length() || expression.charAt(index) != ')') {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
                index++;
                return result;
            }
            return parseVariableOrConst();
        }

        private Expression parseVariableOrConst() {
            if (index < expression.length() && (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {
                int start = index;
                while (index < expression.length() && (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {
                    index++;
                }
                return new Const(Double.parseDouble(expression.substring(start, index)));
            }
            if (index < expression.length() && Character.isLetter(expression.charAt(index))) {
                return new Variable(String.valueOf(expression.charAt(index++)));
            }
            throw new IllegalArgumentException("Unexpected character: " + expression.charAt(index));
        }
    }
}
