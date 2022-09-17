package Game;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int ranNumber = (int) (Math.random() * 50 + 1);
        boolean winning = false;

        System.out.println("Randomly chose a number between 1 & 50");
        System.out.println("Guess the number :) ");


        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i > 0; i--) {
            System.out.println(" You have " + i + " guess ");
            int guess = scanner.nextInt();

            if (ranNumber < guess) {
                System.out.println("its less than " + guess);
            }
            if (ranNumber > guess) {
                System.out.println("Its greater than " + guess);

            }
            if (ranNumber == guess) {
                winning = true;
                break;
            }
            if (winning) {
                System.out.println("you are a winner ");
            } else {
                System.out.println("The winning number was " + ranNumber);
            }
        }
    }
}
