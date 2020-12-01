package interviewsQuestions;


import java.util.HashSet;
import java.util.Set;

public class SumOfTwoNumbers {
    public static boolean solve(int[] nums, int target) {
        Set<Integer> set = new HashSet<>() {};

        if (nums.length <= 1) return false;
        for (int num : nums) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 5};
        int k = 10;
        boolean result = solve(nums, k);

        System.out.print(result);
    }
}