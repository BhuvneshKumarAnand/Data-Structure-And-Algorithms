package BitManipulationPrep;

public class BitManipulationPrep {

    /*
    * Power of Two
    *
    Given an integer n, return true if it is a power of two. Otherwise, return false.

    An integer n is a power of two, if there exists an integer x such that n == 2x.
    * */
    public static boolean isPowerOfTwo(int n) {
        if (n>0) {
            return (n & (n - 1)) == 0;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
    }
}
