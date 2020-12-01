package interviewsQuestions;
import java.util.Arrays;
import java.util.HashMap;

public class LargestAnagramGroup {
    public static int solve(String[] words) {
        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();
            Arrays.sort(arr);
            words[i] = new String(arr);
        }
        HashMap<String, Integer> map = new HashMap<>();
        int cur = 0, freq[] = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            map.put(words[i],map.getOrDefault(words[i],cur++));
            freq[map.get(words[i])]++;
        }
        int max = 0;
        for (int i = 0; i < freq.length; i++) {
            max = Math.max(max, freq[i]);
        }
        return max;
    }

    public static void main(String[] args){
    String[] words={"doysoy", "kpqork", "ba", "awcsh", "g", "m", "pk", "vlg", "zia",
                    "gwxxy", "k", "z", "itd", "ffxaih", "eko", "xoauo", "vsfjl",
                    "iqc", "yd", "menbt", "q", "ucmdp", "ue", "d", "skshnm", "r", "bq",
                    "oyyosd", "prkqko", "rokqkp", "ab", "ba", "shawc", "g", "m", "kp",
                    "lvg", "glv", "zai", "yxxwg", "k", "z", "tdi", "itd", "ffxiah", "eok",
                    "uxooa", "ouxao", "sjlvf", "vjfsl", "sjlfv", "jfvsl", "fjlvs", "vjsfl",
                    "ciq", "yd", "dy", "ebmnt", "q", "upcmd", "ue", "d", "nhsmsk", "r", "bq"};
    int res=solve(words);
        System.out.println(res);
    }
}

