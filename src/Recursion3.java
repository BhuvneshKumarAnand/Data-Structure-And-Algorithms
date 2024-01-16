public class Recursion3 {

    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input,x,0);
    }
    public static boolean checkNumber(int input[], int x,int StartIndex){
        if(StartIndex == input.length){
            return false;
        }if (input[StartIndex]==x){
            return true;
        }
        return checkNumber(input,x,StartIndex+1);
    }
    public static void main(String[] args) {
        int[] arr={2,5,8};
        int x=5;
        int y=6;
        System.out.println(checkNumber(arr,y));
    }
}
