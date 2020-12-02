package interviewsQuestions;

public class LargestNumberByTwoTimes {
    public static boolean solve(int[] nums) {
        if (nums.length < 2) return false;
        int maxVal = Integer.MIN_VALUE, secMaxVal =Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > maxVal) {
                secMaxVal = maxVal;
                maxVal = num;
            } else if (num > secMaxVal) {
                secMaxVal = num;
            }
        }
        return maxVal > 2 * secMaxVal;
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {3, 6, 15};
        System.out.println(solve(nums));
    }
}

