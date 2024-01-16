public class RecursionAssignment4 {
    public static int convertStringToInt(String input){
        // Write your code here
        if (input.length() == 1)
            return (input.charAt(0) - '0');
        int smallout=input.charAt(input.length()-1)-'0';

        return smallout+10*convertStringToInt(input.substring(0,input.length()-1));

    }
    public static void main(String[] args) {
        String s="1234";
        convertStringToInt(s);
        System.out.println(convertStringToInt(s));
        // character '0' has ASCII value 48
//        int a=s.charAt(2)-'0';
//        int b=s.charAt(2)-48;
//        System.out.println(a);
//        System.out.println(b);

        //separate charater into integer
//        int sum=0,temp;
//        for(int i=s.length()-1;i>=0;i--){
//            sum=sum+s.charAt(i)-48;
//
//            System.out.println(s.charAt(i)-'0');
//        }

        //sum of String like integer
//        for(int i=0;i<s.length();i++){
//            sum=sum+s.charAt(i)-48;
//        }
//        System.out.println(sum);
    }
}
