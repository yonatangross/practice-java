package interviewsQuestions;

// https://binarysearch.com/problems/Closest-Distance-to-Character
// https://www.geeksforgeeks.org/shortest-distance-to-every-other-character-from-given-character/
public class PalindromicInteger {
    public static boolean solve(int num) {
        int numToFlip = num;
        int flippedNumber = 0;
        int currentRemainder;

        while (numToFlip != 0) {
            currentRemainder = numToFlip % 10;
            flippedNumber = flippedNumber * 10 + currentRemainder;
            numToFlip /= 10;
        }
        return flippedNumber == num;
    }

    // Driver code
    public static void main(String[] args) {
        Integer[] nums = {121, 20200202, 44};

        for (int num : nums) {
            System.out.println(num + ": " + solve(num));
        }
    }
}

