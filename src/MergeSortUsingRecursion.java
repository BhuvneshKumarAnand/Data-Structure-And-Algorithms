public class MergeSortUsingRecursion {
    //Print Array
    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
//        System.out.println();
    }
    //Merge Sort

    public static void merge(int[]s1,int[]s2,int[]d){
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }else{
                d[k]=s2[j];
                k++;
                j++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k]=s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                k++;
                j++;
            }
        }
    }
    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here

        //Divide unsorted array into two parts
        if(arr.length<=1){
            return;
        }

        int[] a=new int[arr.length/2];
        int[] b=new int[arr.length- a.length];

        for (int i=0;i< arr.length/2;i++){
            a[i]=arr[i];
        }
        for (int i= arr.length/2;i< arr.length ;i++){
            b[i- arr.length/2]=arr[i];
        }
//        printArray(a);
//        System.out.println();
//        printArray(b);
        mergeSort(a,0,a.length-1);
        mergeSort(b,0,b.length-1);
        merge(a,b,arr);

    }
    public static void main(String[] args) {
        int[] arr={9 ,3 ,6 ,2 ,0};
        mergeSort(arr,0, arr.length-1);

        printArray(arr);
    }
}
