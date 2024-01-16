public class Practice {
    public static int ArraySum(int[] arr){
        return ArraySum(arr,0);
    }
    public static int ArraySum(int[] arr,int si){
        int sum=0;
        if (si== arr.length-1)
            return arr[si];
        sum=arr[0]+ArraySum(arr,si+1);
        return sum;
    }

    public static int SumOfArray(int[] arr){

        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        int sum;
        int[] na=new int[n-1];
        for(int i=0;i<n-1;i++){
            na[i]=arr[i+1];
        }
        sum=arr[0]+SumOfArray(na);
        return sum;
    }
    public static int[] NewArray(int[] arr){
        int n=arr.length;
        int[] na=new int[n-1];
        for(int i=0;i<n-1;i++){
            na[i]=arr[i];
        }

        return na;
    }
    public static void main(String[] args) {
        int[] arr={2,5,8,7,6};
//        int[] a=NewArray(arr);
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }

        System.out.println(SumOfArray(arr));
        int sum=ArraySum(arr);
        System.out.println(sum);

    }
}
