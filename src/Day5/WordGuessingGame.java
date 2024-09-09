package Day5;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WordGuessingGame {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        // ... add more words

        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        String wordToGuess = words.get(randomIndex);

        String hiddenWord = "_".repeat(wordToGuess.length());
        int attemptsLeft = 5; // Adjust as needed

        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0) {
            System.out.println("Hidden word: " + hiddenWord);
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);

            boolean isCorrect = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    isCorrect = true;
                    hiddenWord = hiddenWord.substring(0, i) + guess + hiddenWord.substring(i + 1);
                }
            }

            if (isCorrect) {
                System.out.println("Correct guess!");
            } else {
                System.out.println("Incorrect guess.");
                attemptsLeft--;
            }

            if (!hiddenWord.contains("_")) {
                System.out.println("Congratulations! You won!");
                break;
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("Game over! The word was: " + wordToGuess);
        }
    }
}