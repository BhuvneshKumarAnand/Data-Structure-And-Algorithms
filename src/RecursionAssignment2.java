public class RecursionAssignment2 {
    //check palindrome using recursion
    public static boolean isStringPalindrome(String input,int si,int ei) {
        // Write your code here
        if (si>ei){
            return true;
        }

        if (input.length()<=1){
            return true;
        } else if (input.charAt(si)!=input.charAt(ei)) {
//            System.out.println(input.charAt(si)+" "+input.charAt(ei));
            return false;
        }else{
            return isStringPalindrome(input,si+1,ei-1);
        }

    }
    public static boolean isStringPalindrome(String input) {
        // Write your code here
        return isStringPalindrome(input,0,input.length()-1);


    }

    public static void main(String[] args) {
        String s="racecar";
//        System.out.println(s.charAt(0));
        System.out.println(isStringPalindrome(s));
    }
}
