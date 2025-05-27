import java.util.Scanner;
import java.util.Random;

public class Exercise10_NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! The number was " + numberToGuess);
            }
        } while (guess != numberToGuess);
    }
}