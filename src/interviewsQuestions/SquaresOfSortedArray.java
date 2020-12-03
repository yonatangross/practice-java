package interviewsQuestions;

public class SquaresOfSortedArray {
    public static int[] solve(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        algorithms.MergeSort.sort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-7, -3, 2, 3, 11};

        int[] result = solve(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}