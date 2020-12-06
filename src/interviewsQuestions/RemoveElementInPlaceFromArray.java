package interviewsQuestions;

public class RemoveElementInPlaceFromArray {

    public static int solve(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }

        for (int j=0;j<n;j++){
            System.out.print(nums[j]+" ");
        }
        System.out.println();
        System.out.println("n = " + n);
        return n;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        solve(nums, val);
    }
}