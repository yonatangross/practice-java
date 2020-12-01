package interviewsQuestions;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;

        for (int[] account : accounts) {
            int currentCustomerWealth = 0;
            for (int i : account) {
                currentCustomerWealth += i;
            }
            if (currentCustomerWealth > maxWealth) {
                maxWealth = currentCustomerWealth;
            }
        }
        return maxWealth;
    }
}