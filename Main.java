import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose a number:-\n\t 1 for ROCK\n\t 2 for PAPER\n\t 3 for scissor");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        Random rand = new Random();
        int randomNum = rand.nextInt(3) + 1; // random number is generated

        // user choice
        if (num >= 1 && num <= 3) {
            if (num == 1) {
                System.out.println("your choice is Rock");
            } else if (num == 2) {
                System.out.println("your choice is Paper");

            } else if (num == 3) {
                System.out.println("your choice is Scissor ");

            }

            // computer choice
            System.out.println("computer chooses: " + randomNum);// computer chooses
            if (randomNum == 1) {
                System.out.println("computer choice is Rock");
            } else if (randomNum == 2) {
                System.out.println("computer choice is Paper");

            } else if (randomNum == 3) {
                System.out.println("computer choice is Scissor ");

            }

            if (num == randomNum) {
                System.out.println("Its a draw \n\t Try Again");
            } else if (num == 1 && randomNum == 3) {
                System.out.println("you win");

            } else if (num == 2 && randomNum == 1) {
                System.out.println("you win");

            } else if (num == 3 && randomNum == 2) {
                System.out.println("you win");

            } else System.out.println("you loose");
        }
        else System.out.println("invalid input");
    }
}