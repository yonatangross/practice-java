package interviewsQuestions;

import java.util.HashMap;

public class AUniqueString {
    public static boolean solve(String s) {
        HashMap<Character,Boolean> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);

            if(!map.getOrDefault(currChar,false))
                map.put(currChar,true);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aab";

        System.out.println(solve(str));
    }
}
