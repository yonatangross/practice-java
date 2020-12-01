package interviewsQuestions;

import java.util.HashMap;

public class ListSplitting {
    public boolean solve(int[] nums, int k) {
        if(k==0 || k==1)
            return true;

        HashMap<Integer,Integer> map = new HashMap();
        for(var val : nums){
            map.putIfAbsent(val,0);
            map.put(val,map.get(val)+1);
        }

        for( var entry : map.entrySet()){
            if(nums.length / k < entry.getValue())
                return false;

        }
        return true;
    }
}
