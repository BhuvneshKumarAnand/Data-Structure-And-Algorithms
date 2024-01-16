public class Resursion1 {
    public static int fibonacci(int n){
        if(n==1||n==2){
//            System.out.print("1");
            return 1;
        }
        int a=fibonacci(n-1);
        int b=fibonacci(n-2);
        int output=a+b;
        return output;
    }
    public static void NaturatN(int n){
        if(n==0){
            return;
        }
        NaturatN(n-1);
        System.out.print(n+" ");
    }
    public static void printn(int n){
        if(n==0){
            return;
        }
        printn(n-1);
        System.out.println(n);
    }
    public static int count(int n){
        if(n==0){
            return 0;
        }
        int smallOutput=count(n/10);
        int count=1+smallOutput;
        return count;
    }
    public static int Power(int x,int n ){
        //x^n
//        if(n==1){
//            return x;
//        }
        if(n==0){
            return 1;
        }
        int power=x*Power(x,n-1);
        return power;
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int x=sum(n-1);
        int sum=n+x;
        return sum;
    }
    public static void main(String[] args) {
//        int n=10;
//        System.out.println(sum(10));
//        System.out.println(Power(2,2));
//        System.out.println(count(123));
//        printn(10);
//        NaturatN(10);
        System.out.println(fibonacci(55));
    }
}
