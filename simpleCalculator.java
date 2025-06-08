import java.util.Scanner;

public class simpleCalculator {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        //input first number
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        //enter operator
        System.out.println("Enter operator( +, -, *, /)");
        char operator = scanner.next().charAt(0);

        //input second number
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid operator.");
                break;
        }

        scanner.close();
    }
}