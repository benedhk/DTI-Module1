package Day6;

public class ArraySorter {
    public static void sortArray(int[] arr, String direction) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if ((direction.equals("asc") && arr[i] > arr[i + 1]) ||
                        (direction.equals("desc") && arr[i] < arr[i + 1])) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}