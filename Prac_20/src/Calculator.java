public class Calculator {
    public static <T extends Number, U extends Number> double sum(T number1, U number2){
        return number1.doubleValue() + number2.doubleValue();
    }
    public static <T extends Number, U extends Number> double multiply(T number1, U number2){
        return number1.doubleValue() * number2.doubleValue();
    }
    public static <T extends Number, U extends Number> double div(T number1, U number2){
        return number1.doubleValue() / number2.doubleValue();
    }
    public static <T extends Number, U extends Number> double subtraction(T number1, U number2){
        return number1.doubleValue() - number2.doubleValue();
    }
}
