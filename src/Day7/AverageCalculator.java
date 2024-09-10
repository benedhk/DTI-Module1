package Day7;

import java.util.Scanner;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers to calculate the average (enter 'q' to finish):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
                }
            catch (NumberFormatException e) {
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
                }
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
