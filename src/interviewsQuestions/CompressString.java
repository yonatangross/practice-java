package interviewsQuestions;

import java.util.HashMap;

public class CompressString {
    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() <= 1) return s;
        char lastChar = s.charAt(0);
        char currChar;
        sb.append(lastChar);
        for (int i = 1; i < s.length(); i++) {
            currChar = s.charAt(i);
            if (currChar != lastChar) {
                sb.append(currChar);
                lastChar = currChar;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaaaabbbccccaaaaddf";

        System.out.println(solve(str));
    }
}
