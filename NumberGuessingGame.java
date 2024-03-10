import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random randint = new Random();
        int randomNumber = randint.nextInt(1, 11);
        int points = 0;
        int chances = 3;
        boolean running = true;
        while (running) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Points: %d\tChances: %d\n", points, chances);
            System.out.println("Guess a number: ");
            // check
            int guess = input.nextInt();
            if (guess != randomNumber) {
                if (chances > 0) {
                    chances -= 1;
                    if (guess > randomNumber) {
                        System.out.println("Guess lower");
                    } else {
                        System.out.println("Guess higher");
                    }
                } else {
                    points -= 1;
                    System.out.printf("Sorry, '%d' is not correct, the number is '%d'\n", guess, randomNumber);
                    System.out.printf("You have '%d' points left\n", points);
                    if (points <= 0) {
                        System.out.print("Sorry you lost the game");
                        running = false;
                    }
                }
            }
            System.out.println("\n");
        }
    }
}
