public class RecursionAssignment5 {
    //Pair Star
    //Send Feedback
    //Given a string S, compute recursively a new string where identical chars that
    //are adjacent in the original string are separated from each other by a "*".
    //Input format :
    //String S
    //Output format :
    //Modified string
    //Constraints :
    //0 <= |S| <= 1000
    //where |S| represents length of string S.
    //Sample Input 1 :
    //hello
    //Sample Output 1:
    //hel*lo
    //Sample Input 2 :
    //aaaa
    //Sample Output 2 :
    //a*a*a*a
    public static String addStars(String s) {
        // Write your code here
        if (s.length()-1==0)
            return s;
        return s;
    }
    public static void main(String[] args) {
        String s="aaaa";
        String n=new String();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==s.charAt(i+1)){
//                n.charAt(i+1)='*';
            }
        }

    }
}
