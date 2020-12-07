package interviewsQuestions;

import java.util.Arrays;

public class RunLengthEncoding {
    public static String solve(String s) {
        if (s.length() == 0) {
            return "";
        }

        StringBuilder sb= new StringBuilder();
        int occurs=0;
        char currCh=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=currCh){
                sb.append(occurs);
                sb.append(currCh);
                currCh=s.charAt(i);
                occurs=0;
            }
            occurs+=1;
        }
        sb.append(occurs);
        sb.append(currCh);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbbccdaa";
        System.out.println(solve(s));
    }
}
