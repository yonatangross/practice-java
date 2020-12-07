package interviewsQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ThreeSixNine {
    public static boolean contains369(int n) {
        while (n > 0) {
            int d = n % 10;
            if (d == 3 || d == 6 || d == 9)
                return true;
            n = n / 10;
        }
        return false;
    }

    public static String[] solve(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            if (((i + 1) % 3 == 0) || contains369(i + 1))
                arr[i] = "clap";
            else
                arr[i] = Integer.toString(i + 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int num = 16;
        String[] strings = solve(num);
        System.out.println(Arrays.toString(strings));
    }
}
