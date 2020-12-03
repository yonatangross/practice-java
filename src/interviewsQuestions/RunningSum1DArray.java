package interviewsQuestions;

import java.util.HashMap;

public class RunningSum1DArray {
    public static int[] solve(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] + nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 10, 1};

        int[] result = solve(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
