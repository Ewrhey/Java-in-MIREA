import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class CalculatorRPN {
    public CalculatorRPN(String string){
        try {
            System.out.println(calculateRPN(string));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public CalculatorRPN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input RPN task: ");
        String input = scanner.nextLine();
        try {
            System.out.println(calculateRPN(input));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private double calculateRPN(String stringToken) throws Exception{
        Stack<Double> answer = new Stack<>();
        String[] tokens = stringToken.split(" ");
        for (String token : tokens){
            switch (tokenType(token)){
                case 1://numb
                    answer.push(Double.parseDouble(token));
                    break;
                case 2: //operation
                    if (answer.size() < 2)
                        throw new IllegalArgumentException("Need 2 numbers for operation " + token);
                    double numb2 = answer.pop(), numb1 = answer.pop();
                    switch (token){
                        case "+":
                            answer.push(numb1 + numb2);
                            break;
                        case "-":
                            answer.push(numb1 - numb2);
                            break;
                        case "*":
                            answer.push(numb1 * numb2);
                            break;
                        case "/":
                            if (numb2 == 0)
                                throw new ArithmeticException("Division by zero is impossible: " + numb1 + "/" + numb2);
                            answer.push(numb1 / numb2);
                            break;
                    }
                    break;
                default: //error
                    throw new IllegalArgumentException("Incorrect input: " + token);
            }
        }
        if (answer.size() > 1)
            throw new IllegalArgumentException("Need 2 numbers and 1 operator for operation");
        return answer.pop();
    }

    private int tokenType (String token){
        // 1 - numb, 2 - operation, 0 - error
        try {
            double temp = Double.parseDouble(token);
            return 1;
        }
        catch (NumberFormatException e){
            if (Objects.equals(token, "+")
                    || Objects.equals(token, "-")
                    || Objects.equals(token, "/")
                    || Objects.equals(token, "*"))
                return 2;
            return 0;
        }
    }



}
