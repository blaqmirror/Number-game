import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100) + 1;
        boolean hasWon = false;
        System.out.println("I have randomly guessed a number from 1 to 100. Try guessing it!");

        Scanner scanner = new Scanner(System.in);  //System.in = To take & read input from the user's terminal window
        for (int i=10; i>0; i--) {
            System.out.println("You have " + i + " guesses left.");
            int guess = scanner.nextInt();   //The scanner takes the next input as an integer
                                            /* .nextInt = method of the Scanner class
                                               Object scanner METHOD CALLS .nextInt  */
            if (randomNumber < guess) {
                System.out.println("The number is smaller than " + guess + " your guess. Go again.");
            } else if (randomNumber > guess) {
                System.out.println("The number is bigger than " + guess + " your guess. Go again.");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon){
                System.out.println("CONGRATS! You guessed it right!");
        } else {
                System.out.println("Sorry, The number was "+ randomNumber);
        }
    }
}

