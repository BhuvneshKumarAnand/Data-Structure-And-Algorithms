//import static java.lang.StringUTF16.charAt;

public class RecursionString1 {
    public static String removeX(String input,char a){
        if(input.length()==0){
            return input;
        }
        String SmallOutput=removeX(input.substring(1),'x');
        if(input.charAt(0)==a){
            return SmallOutput;
        }else{
            return input.charAt(0)+SmallOutput;
        }
    }
    public static String removeX(String input){
        // Write your code here
        return removeX(input, 'x');

    }
    public static void main(String[] args) {
        System.out.println(removeX("abcxdxex"));
    }
}
