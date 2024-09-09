package Day6;

import java.util.Scanner;

/*Java Array Program For Array Rotation

Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
Output:  3 4 5 6 7 1 2

Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
So, Final result: 3, 4, 5, 6, 7, 1, 2 */

public class ArrayRotation {
    public static int initial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array Length :");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Input number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        return arr[arr.length - 1];
    }
 //[1][2][3][4]
    public static int rotate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick rotator number :");
        int rotator = scanner.nextInt();
        scanner.nextInt();
        int[] temp = new int[rotator];

        // Create a temporary array to store the first d elements
        int[] arr = new int[0];
        int i;
        for (i = 0; i < rotator; i++) {
            temp[i] = arr[i]; //d=2 -> [1][2]
        }
        return temp[i];

        // Shift the remaining elements to the left

    }

}
//1. Input array length
//2. Input array element
//3. Pick "d" in array
//4. Temp array = modified array
//5. Update array (latest)
//6. Output
