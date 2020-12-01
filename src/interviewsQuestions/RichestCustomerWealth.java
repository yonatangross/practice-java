package interviewsQuestions;

class RichestCustomerWealth {
    public static int solve(int[][] accounts) {
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

    public static void main(String[] args){
        int[][] accounts={{2,8,7},{7,1,3},{1,9,5}};
        int res=solve(accounts);
        System.out.println(res);
    }
}