package interviewsQuestions;
import java.util.*;
// https://binarysearch.com/problems/Closest-Distance-to-Character
// https://www.geeksforgeeks.org/shortest-distance-to-every-other-character-from-given-character/
public class ClosestDistanceToCharacter {
    static void shortestDistance(String s, char c)
    {
        // Find distance from occurrences of X
        // appearing before current character.
        int prev = Integer.MAX_VALUE;
        int[] res = new int[s.length()];

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
                prev = i;
            if (prev == Integer.MAX_VALUE)
                res[i]=(Integer.MAX_VALUE);
            else
                res[i]=(i - prev);
        }

        // Find distance from occurrences of X
        // appearing after current character and
        // compare this distance with earlier.
        prev = Integer.MAX_VALUE;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) == c)
                prev = i;
            if (prev != Integer.MAX_VALUE)
                res[i]= Math.min(res[i], prev - i);
        }

        for (Integer val: res)
            System.out.print(val+" ");
    }

    // Driver code
    public static void main(String[] args)
    {
        String S = "captainpickeliisbial";
        char X = 'i';
        shortestDistance(S, X);
    }
}

