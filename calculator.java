import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter operation (+ or -): ");
        String operation = scanner.next();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double result;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else {
            System.out.println("Invalid operation. Use + or -.");
            return;
        }

        System.out.println("Result: " + result);
    }
}