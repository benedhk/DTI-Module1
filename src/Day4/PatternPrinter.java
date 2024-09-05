package Day4;

import java.util.Scanner;

public class PatternPrinter {
    public static void printPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        //The outer loop (for (int i = 1; i <= rows; i++)) iterates from 1 to the number of rows.
        for (int i = 1; i <= rows; i++) {
            //The inner loop (for (int j = 1; j <= i; j++)) iterates from 1 to the current row number (i).
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
    }
}

/*
Here's a breakdown of the steps for clarity:
Input: 2
Iteration 1 (Outer loop):

i = 1:
Inner loop:
j = 1:
Print "*"
j = 2:
The condition j <= i is false (2 is not less than or equal to 1), so the inner loop ends.
Print a newline.
Iteration 2 (Outer loop):

i = 2:
Inner loop:
j = 1:
Print "*"
j = 2:
Print "*"
j = 3:
The condition j <= i is false (3 is not less than or equal to 2), so the inner loop ends.
Print a newline.*/
