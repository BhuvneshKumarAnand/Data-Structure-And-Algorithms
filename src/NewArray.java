public class NewArray {

    public static int Index(int[] arr,int x){

        if (arr.length==0){
            return -1;
        }
        if (arr[0]==x){
            return 0;
        }
        int[] a=new int[arr.length-1];
        for(int i=0;i<a.length;i++){
            a[i]=arr[i+1];
        }
        int index=Index(a,x);
        if (index==-1){
            return -1;
        }else {
            return index+1;
        }

    }

    public static void main(String[] args) {
        int[] arr={2,5,8,7,6};
        System.out.println(Index(arr,6));
//        int[] a=new int[arr.length-1];
//        for(int i=0;i<a.length;i++){
//            a[i]=arr[i+1];
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
    }
}
