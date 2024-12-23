package Projects;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			Random random = new Random();
			int randomNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
			int guess, attempts = 0;

			System.out.println("Guess the number (between 1 and 100):");

			while (true) {
			    guess = scanner.nextInt();
			    attempts++;

			    if (guess < randomNumber) {
			        System.out.println("Too low!");
			    } else if (guess > randomNumber) {
			        System.out.println("Too high!");
			    } else {
			        System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
			        break;
			    }
			}
		}
    }
}