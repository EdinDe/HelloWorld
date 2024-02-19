import java.util.Random;
import java.util.Scanner;

public class GuessNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        int numberToGuess = rand.nextInt(10) + 1;
        int userGuessed = -1;
        int guesses = 1;

        System.out.println("Guess a number from 1-10");

        while (userGuessed != numberToGuess) {

            userGuessed = scanner.nextInt();
            if (userGuessed < numberToGuess) {
                System.out.println("tallet er større");
                guesses++;
            }
            if (userGuessed > numberToGuess) {
                System.out.println("tallet er mindre");
                guesses++;
            }
        }
        System.out.println("correct");
        System.out.println("antal gæt = " +  guesses);
    }
}
