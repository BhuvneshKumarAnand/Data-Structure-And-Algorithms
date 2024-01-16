//import java.util.*;
import java.lang.*;

public class RecursionAssignment {

    public static double pow(int k){
        if(k==0){
            return 1;
        }

        double result=1;
        for(int i=0;i<k;i++){
            result=result*2.0;
//            System.out.println(result);
        }
        return result;
    }
    public static double findGeometricSum(int k){
        // Write your code here
        //1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k)
        //using recursion
        if (k==0)
            return 1;
        return 1/pow(k) + findGeometricSum(k-1);



    }

    public static void main(String[] args) {
//        double a,d;
//        int b=1;
//        int c=2;
//        a= (double) 1 /2;
//        d=(double)b/c;
//        System.out.println(d);
//        System.out.println(a);

        System.out.println(pow(2));
        System.out.println(findGeometricSum(5));
    }
}
