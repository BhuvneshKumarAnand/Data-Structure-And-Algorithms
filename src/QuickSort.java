public class QuickSort {
    public static void quickSort(int[] arr,int si,int ei){
//        int si=arr[0];
//        int ei=arr[arr.length-1];
        if (si>=ei){
            return;
        }
        int pivotIndex=partition(arr,si,ei);
        quickSort(arr,si,pivotIndex-1);
        quickSort(arr,pivotIndex+1,ei);


    }

    private static int partition(int[] arr,int si,int ei) {
        int pivotElement=arr[si];
        int smallerNumCount=0;

        for (int i=si+1;i<=ei;i++){
            if (arr[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp=arr[si+smallerNumCount];
        arr[si+smallerNumCount]=pivotElement;
        arr[si]=temp;

        int i=si;
        int j=ei;
        while (i<j){
            if (arr[i]<pivotElement){
                i++;
            } else if (arr[j]>=pivotElement) {
                j--;
            }else{
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallerNumCount;
    }

    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr={4,1,5,23,756,26};
        quickSort(arr,0,arr.length-1);
        print(arr);

    }
}
