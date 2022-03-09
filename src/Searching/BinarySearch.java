package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8};
        int k = 9;
        System.out.println(bSearch(arr,0, arr.length- 1, k));
    }
    public static int bSearch(int[] arr ,int l , int r,  int k ){
        if(l > r) return -1;

        int mid  = (l + r) / 2;
        if(arr[mid] == k) return mid;
        else if(arr[mid] > k) return bSearch(arr, 0 , mid-1, k);
        else return bSearch(arr, mid+1,r, k);
    }
}
