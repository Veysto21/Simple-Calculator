import java.util.Scanner;

public class simpleCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Simple Calculator");

        boolean keepRunning = true;

        while (keepRunning) {
            double num1 = getNumber("Enter the first number: ");
            char operator = getOperator();
            double num2 = getNumber("Enter the second number: ");

            double result = calculate(num1, num2, operator);
            System.out.printf("Result: %.2f\n", result);

            // Ask to exit — keep asking until valid input
            while (true) {
                System.out.print("Do you want to exit? (yes/no): ");
                String response = scanner.next().toLowerCase();

                if (response.startsWith("y")) {
                    keepRunning = false;
                    break;
                } else if (response.startsWith("n")) {
                    break; // continue outer loop
                } else {
                    System.out.println("Invalid response. Please type yes or no.");
                }
            }

            System.out.println(); // spacing between rounds
        }

        System.out.println("Calculator exited. Goodbye!");
        scanner.close();
    }

    public static double getNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static char getOperator() {
        System.out.print("Enter an operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/':
                if (num2 != 0) return num1 / num2;
                System.out.println("Error: Division by zero!");
                return Double.NaN;
            default:
                System.out.println("Invalid operator.");
                return Double.NaN;
        }
    }
}