package interviewsQuestions;

public class MergeSortedArray {
    public static void solve(int[] nums1, int m, int[] nums2, int n) {
        int nums1CurrInd = m - n - 1;
        int nums2CurrInd = n - 1;
        int i;
        for (i = m - 1; i >= 0 && nums1CurrInd >= 0 && nums2CurrInd >= 0; i--) {
            if (nums1[nums1CurrInd] > nums2[nums2CurrInd]) {
                nums1[i] = nums1[nums1CurrInd--];
            } else
                nums1[i] = nums2[nums2CurrInd--];
        }
        while (nums1CurrInd >= 0) {
            nums1[i--] = nums1[nums1CurrInd--];
        }
        while (nums2CurrInd >= 0) {
            nums1[i--] = nums2[nums2CurrInd--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,  0};
        int[] nums2 = new int[]{2};

        solve(nums1, nums1.length, nums2, nums2.length);
    }
}
