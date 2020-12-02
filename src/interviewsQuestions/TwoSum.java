package interviewsQuestions;

import java.util.HashMap;

public class TwoSum {
    public static  int[] solve(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            map.put(nums[i],i);
        }
        return null;
    }
public static void main(String[] args){
     int[] nums= new int[]{3,3};
     int target=6;

    int[] result=solve(nums,target);
    System.out.println("["+result[0]+", "+result[1]+"]");
    }
}
