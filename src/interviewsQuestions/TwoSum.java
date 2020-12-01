package interviewsQuestions;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[]{};
        for (int num :
                nums) {
            map.put(num, (target - num));
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] pairs = twoSum(nums, target);

        for (int num : pairs) {
            System.out.print(num + " ");
        }
    }
}