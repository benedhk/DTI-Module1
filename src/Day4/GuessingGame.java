package Day4;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void guessNumber(){

        //Creates a Random object and uses nextInt(100) + 1 to generate a random integer between 1 and 100.
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        //This while loop will continue to run until the user guesses correctly, which will break the loop.
        while(true){
            System.out.println("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            if(guess == randomNumber){
                System.out.println("Congratulations! You guessed it!");
                break;
            } else if (guess > randomNumber) {
                System.out.println("Your number is too high!");
            } else {
                System.out.println("Your number is too low!");
            }
            attempts++;
            if(attempts >= 5){
                System.out.println("The random number is " + randomNumber);
                break;
            }
        }



        
    }
}
