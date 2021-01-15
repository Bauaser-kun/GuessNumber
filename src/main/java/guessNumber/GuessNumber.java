package guessNumber;

import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Intro();
        Game();
    }

    public static void Intro() {
        System.out.println("How should I call you?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Random Number between 0 and 1000 will be chosen, " +
                "\n try guessing what number it is");
    }

    public static void Game() {
        int c = 1;
        Scanner game = new Scanner(System.in);
        Random randomizer = new Random();
        int random = randomizer.nextInt(1001);
        int guess = game.nextInt();
        while (guess != random )
        {
            if (guess < random) {
                c++;
                System.out.println("My number is higher than that " +
                        "\nTry again");
                guess = game.nextInt();
            } else {
                c++;
                System.out.println("My number is lower than that " +
                        "\nTry again");
                guess = game.nextInt();
            }
        }
        System.out.println("Excellent! You guessed at your " + c + " try!");
    }
}

