import java.util.Random;
import java.util.Scanner;

class GuessNumber12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        int numberToGuess = 5;
        int userGuessed = -1;

        System.out.println("Guess a number from 1-10");

        while (userGuessed != numberToGuess) {

            userGuessed = scanner.nextInt();
            if (userGuessed!= numberToGuess) {

            }
            System.out.println("correct");

        }

    }

}

