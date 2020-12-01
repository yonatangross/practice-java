package interviewsQuestions;

public class ListPartitioning {
    public  static String[] solve(String[] strs) {
        if(strs==null || strs.length<=1)
            return strs;

        int len=strs.length;
        int low=0,mid=0,high=len-1;

       while(mid<=high){
           switch (strs[mid].charAt(0)) {
               case 'r' -> {
                   swapStrings(strs, low, mid);
                   low++;
                   mid++;
               }
               case 'g' -> mid++;
               case 'b' -> {
                   swapStrings(strs, mid, high);
                   high--;
               }
           }
       }

       return strs;
    }

    private static void swapStrings(String[] strs, int first, int second) {
        String temp= strs[first];
        strs[first]=strs[second];
        strs[second]=temp;
    }

    public static void main(String[] args){

    String[] strs= new String[]{
                "green", "blue", "red", "red"
        };

    strs= solve(strs);
        for (var str :
                strs) {
            System.out.printf(str+", ");
        }
        System.out.println();
    }
}
