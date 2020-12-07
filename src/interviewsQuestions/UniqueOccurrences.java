package interviewsQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueOccurrences {
    public static boolean solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> occursSet = new HashSet<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var val : map.values()) {
            if (!occursSet.contains(val)) {
                occursSet.add(val);
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 1, 2, 2, 2, 3};

        System.out.println(solve(nums));
    }
}
