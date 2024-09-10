package Day6;

public class ArrayRotation {
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[n];

        // Copy elements from index d to the end of the temporary array
        System.arraycopy(arr, d, temp, 0, n - d);

        // Copy remaining elements from the beginning of the original array to the end of the temporary array
        System.arraycopy(arr, 0, temp, n - d, d);

        // Copy the temporary array back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
    }
}