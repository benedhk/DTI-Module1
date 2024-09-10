package Day6;

import java.util.Arrays;
import java.util.List;

import static Day6.ArrayRotation.rotateArray;
import static Day6.ArraySorter.sortArray;
import static Day6.FindDuplicates.findDuplicates;
import static Day6.RemoveDuplicates.removeDuplicates;
import static Day6.RemoveOccurrences.removeOccurrences;
import static Day6.StringReverser.reverseString;
import static Day6.WarmerTemperature.dailyTemperatures;

public class Main {
    public static void main(String[] args) {

        //No. 1
        /*int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateArray(arr, d);
        System.out.println("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }*/

        //No. 2
        /*DuplicateChecker duplicateChecker = new DuplicateChecker();
        int[] nums = {1,2,1,4};
        System.out.println("Is there any duplicated number: " + duplicateChecker.containsDuplicate(nums));;
        */

        //No. 3a
        /*int[] nums = {1, 2, 2, 3, 3, 3, 4, 5};
        int length = removeDuplicates(nums);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }*/

        //No. 3b
        /*int[] arr = {8, 7, 5, 2};
        String direction = "asc"; // Change to "desc" for descending order
        sortArray(arr, direction);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }*/

        //No. 4
        /*List<Integer> array = List.of(1, 2, 1, 3, 5, 1);
        int key = 1;
        List<Integer> result = removeOccurrences(array, key);
        System.out.println("Original array: " + array);
        System.out.println("Array after removing occurrences of " + key + ": " + result);
        }*/

        //No. 5
        /*String input1 = "malang";
        String input2 = "mas";

        String reversed1 = reverseString(input1);
        String reversed2 = reverseString(input2);

        System.out.println("Reversed input1: " + reversed1);
        System.out.println("Reversed input2: " + reversed2);*/

        //No.6
        /*int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {1, 1, 2};
        int[] nums3 = {1};

        System.out.println("Duplicates in nums1: ");
        findDuplicates(nums1);
        System.out.println();
        System.out.println("Duplicates in nums2: ");
        findDuplicates(nums2);
        System.out.println();
        System.out.println("Duplicates in nums3: ");
        findDuplicates(nums3);*/

        //No. 7
        /*int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures2 = {30, 40, 50, 60};
        int[] temperatures3 = {30, 60, 90};
        int[] result1 = dailyTemperatures(temperatures1);
        int[] result2 = dailyTemperatures(temperatures2);
        int[] result3 = dailyTemperatures(temperatures3);
        System.out.println("Result 1: " + Arrays.toString(result1));
        System.out.println("Result 2: " + Arrays.toString(result2));
        System.out.println("Result 3: " + Arrays.toString(result3));*/
    }
}




