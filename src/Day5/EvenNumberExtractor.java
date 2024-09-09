package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumberExtractor {
    public static int[] extractEvenNumbers(int[] arr) {
        int[] evenNumbers = new int[arr.length]; // Create a new array of the same size
        int evenIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers[evenIndex++] = num;
            }
        }

        // Resize the evenNumbers array to the actual number of even elements
        int[] result = new int[evenIndex];
        System.arraycopy(evenNumbers, 0, result, 0, evenIndex);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] evenArray = extractEvenNumbers(arr);

        System.out.println("Even numbers: " + Arrays.toString(evenArray));
    }
}