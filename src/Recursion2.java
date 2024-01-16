public class Recursion2 {
    public static int sum(int input[]){
        int n=input.length;
        if (n==1){
            return  input[0];
        }

        int temp[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            temp[i]=input[i+1];
        }
        //Calling method recursively
        int x=sum(temp) + input[0];
        return x;
    }



//        int output=0;
//        for(int i=0;i<input.length;i++){
//            output=output+input[i];
//        }
//
//        return output;



//    public static int sum(int input[],int n) {
//        /* Your class should be named Solution
//         * Don't write main().
//         * Don't read input, it is passed as function argument.
//         * Return output and don't print it.
//         * Taking input and printing output is handled automatically.
//         */
//
////        if (input.length < 0){
////            return 0;
////        }
////        int a=(input.length/2)+1;
////        int b=(input.length/2);
////        int[] arr=new int[a];
////        int[] arr1=new int[b];
////        int output=sum(arr)+sum(arr1);
////        return output;
//        if(n<0){
//            return input[0];
//        }
//        int output=input[n]+sum(input,n-1);
//        return output;
//
//
//    }

    public static void main(String[] args) {
//        int num = 5;
//        int ans = func(num - 1);
//        System.out.println(ans);
        int[] arr={2,2,8};
        int a=sum(arr);
        System.out.println(a);
    }
}
