package interviewsQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class StrictlyIncreasingOrStrictlyDecreasing {
    public static boolean solve(int[] nums) {
        if(nums.length<=1) return true;
        boolean increasing=true;
        boolean decreasing=true;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] <= nums[i+1]) decreasing=false;
            if(nums[i] >= nums[i+1]) increasing=false;
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 5};

        System.out.println(solve(nums));
    }
}
