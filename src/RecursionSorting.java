public class RecursionSorting {
    public static boolean isArraySorted(int[] arr){
        return isArraySorted(arr,0);
    }
    public static boolean isArraySorted(int[] arr,int si){   //si-->Start Index
        if (si==arr.length-1){
            return true;
        }
        if (arr[si]>arr[si+1]){
            return false;
        }

        return isArraySorted(arr,si+1);
    }
    public static void main(String[] args) {
        int[] arr={2,5,8,7,6};
        int[] arr1={2,5,6};
        System.out.println(isArraySorted(arr1));
    }
}
