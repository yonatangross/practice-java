package interviewsQuestions;

import java.util.HashMap;
import java.util.Map;

public class EquivalentValueAndFrequency {
    public static boolean solve(int[] nums){
        if(nums==null || nums.length<=1) return true;

        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();

        for (var val :
                nums) {
            if(map.get(val)==null)
                map.put(val,1);
            else{
                map.put(val,map.get(val)+1);
            }

        }

        for (var entry :
                map.entrySet()) {
            if (entry.getKey() == entry.getValue()) return true;

        }
        return false;
    }
}
