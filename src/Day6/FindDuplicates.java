package Day6;

public class FindDuplicates {
    public static void findDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                System.out.print(Math.abs(nums[i]) + " ");
            } else {
                nums[index] = -nums[index];
            }
        }
    }
}
