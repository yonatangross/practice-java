package interviewsQuestions;

public class DuplicateZeros {
    public static void solve(int[] arr) {
        int[] newArr = new int[arr.length];
        int newArrIndex=0;
        for (int i = 0; i < arr.length && newArrIndex < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[newArrIndex++] = arr[i];
            }
            else {
                newArr[newArrIndex++]=0;
                if(newArrIndex<arr.length){
                    newArr[newArrIndex++]=0;
                }
            }
        }
        System.arraycopy(newArr, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};

        solve(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
