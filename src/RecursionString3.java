public class RecursionString3 {
    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        if(s.length()<=1){
            return s;
        }
        if (s.charAt(0)==s.charAt(1)){
//            s=s.replace(s.charAt(0), ' ');
            return removeConsecutiveDuplicates(s.substring(1));
        }
        else
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
    }

    public static void main(String[] args) {
        String a=removeConsecutiveDuplicates("xxxyyyzwwzzz");
        System.out.println(a);
    }
}
