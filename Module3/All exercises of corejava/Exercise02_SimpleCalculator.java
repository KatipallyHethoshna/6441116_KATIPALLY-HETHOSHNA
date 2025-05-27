import java.util.Scanner;

public class Exercise02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        System.out.print("Choose operation (+ - * /): ");
        char op = scanner.next().charAt(0);

        double result;
        switch (op) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = a / b;
            }
            default -> {
                System.out.println("Invalid operator.");
                return;
            }
        }
        System.out.println("Result: " + result);
    }
}