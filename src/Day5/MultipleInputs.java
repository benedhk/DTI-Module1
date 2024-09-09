package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Ask the user how many numbers they want to enter
        System.out.print("How many numbers do you want to enter? ");
        int numCount = scanner.nextInt();

        // Read each number and add it to the ArrayList
        for (int i = 0; i < numCount; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Print the ArrayList to verify
        System.out.println("The numbers you entered are: " + numbers);
    }
}