public class RecursionAssignment3 {
    //Count Zeros(Recursive)
    public static int countZerosRec(int input){
        // Write your code here
        //00010204-->2
        if (input<10){
            if (input==0){
                return 1;
            }else{
                return 0;
            }
        }if(input%10==0){
            return countZerosRec(input/10)+1;
        }else{
            return countZerosRec(input/10);
        }



    }


    //Multiplication (Recursive)
    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        if(n==0||m==0)
            return 0;

        return m+multiplyTwoIntegers(m,n-1);

    }


    //Sum of digits (recursive)
    public static int sumOfDigits(int input){
        // Write your code here


        if (input%10==input) {
            return input;
        }
        int a=input%10;
        int b=input/10;
        return a+sumOfDigits(b);
    }
    public static void main(String[] args) {
//        int a=12345;
//        System.out.println(125%10);
//        System.out.println(sumOfDigits(a));
//        System.out.println(multiplyTwoIntegers(5,0));
//        System.out.println(countZerosRec(10204));
//        int b=000/10;
//        System.out.println(b);
//        int b=00010204;
        String s="1234";
//        int a=(int)s;

    }
}
