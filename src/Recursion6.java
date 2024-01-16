public class Recursion6 {

    //Binary Search Using Recursion
    public static int BinarySearch(int[] arr,int si,int ei,int target){
        if (si>ei){
            return -1;
        }

        int mid=(si+ei)/2;

        if (arr[mid]==target) {
            return mid;
        } else if (arr[mid]<target) {
            return BinarySearch(arr, mid+1, ei, target);
        }else if (arr[mid]>target) {
            return BinarySearch(arr, si, mid-1, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println(BinarySearch(arr,0, arr.length-1,56 ));
    }
}
