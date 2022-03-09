package MaxSubArray;

import java.util.HashMap;

public class SumK {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        System.out.println(maxLenSubArr(arr,arr.length, k));
    }
    public static int maxLenSubArr(int[] arr, int n, int k){
        int maxLen = -1;
        int start = 0;
        int end = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum  += arr[i];
            if((sum - k) == 0 ){
                maxLen = i+1;
            }
            if(hm.containsKey(sum - k)){
                start = hm.get(sum-k);
                end = i;
                if(maxLen < (end - start)){
                    maxLen = (end - start);
                }
            }
            else{
                hm.put(sum , i);
            }
        }
        return maxLen;
    }
}
