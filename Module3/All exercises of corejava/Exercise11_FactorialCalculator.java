import java.util.Scanner;

public class Exercise11_FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}