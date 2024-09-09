package Day5;

public class WordGuessingGame {
    // Game state variables (e.g., wordToGuess, hiddenWord, attemptsLeft)
    String wordToGuess = "GOAT";
    int attemptsLeft = 5;

    public void playGame() {
        // Select a random word
        String wordToGuess = selectRandomWord();

        // Create a hidden word
        String hiddenWord = hideWord(wordToGuess);

        // Game loop
        while (attemptsLeft > 0) {
            // Get a guess from the player
            char guess = getPlayerGuess();

            // Check if the guess is correct
            boolean isCorrect = isGuessCorrect(wordToGuess, guess);

            // Update the hidden word
            hiddenWord = updateHiddenWord(wordToGuess, hiddenWord, guess);

            // Display the game state
            displayGameState(hiddenWord, attemptsLeft);

            // Check if the player won
            if (isWordGuessed(hiddenWord, wordToGuess)) {
                // Display victory message
                break;
            }

            attemptsLeft--;
        }

        // Display final game result
        displayGameResult(wordToGuess, hiddenWord, attemptsLeft);
    }

    // Implement the individual methods
    private String selectRandomWord(List<String> words) {
        // ...
    }

    // ... other methods
}