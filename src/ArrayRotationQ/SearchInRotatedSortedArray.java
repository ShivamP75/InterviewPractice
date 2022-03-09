package ArrayRotationQ;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 2, 3, 4, 5};
        int k = 8;
        System.out.println(search(arr,0 , arr.length-1, k));
    }

    public static int search(int[] arr, int l ,int r, int k){
        if(l > r) return -1;
        int mid = ( l+ r) / 2;
        if(arr[mid] == k) return mid;
        else if(arr[l] < arr[mid]){
            if(k >= arr[l] && arr[mid] > k){
                return search(arr,l , mid - 1, k);
            }
            else return search(arr, mid+1 , r, k);
        }
        else{
            if(k <= arr[r] && k < arr[mid]){
                return search(arr, mid+1, r, k);
            }
            else return search(arr, l , mid- 1, k);
        }
    }
}
