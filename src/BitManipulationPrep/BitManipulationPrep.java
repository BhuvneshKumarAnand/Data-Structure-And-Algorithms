package BitManipulationPrep;

public class BitManipulationPrep {

    /*
    * Power of Two
    *
    Given an integer n, return true if it is a power of two. Otherwise, return false.

    An integer n is a power of two, if there exists an integer x such that n == 2x.
    * */
    public static boolean isPowerOfTwo(int n) {
        if (n > 0) {
            return (n & (n - 1)) == 0;
        }
        return false;
    }

    /*
    * Power of Four
    Given an integer n, return true if it is a power of four. Otherwise, return false.

    An integer n is a power of four, if there exists an integer x such that n == 4x.
    * */
    public static boolean isPowerOfFour(int n) {
        // Step 1: must be positive
        if (n <= 0) {
            return false;
        }

        // Step 2: must be power of 2 (only one set bit)
        if ((n & (n - 1)) != 0) {
            return false;
        }

        // Step 3: that set bit must be in even position
        return (n & 0x55555555) != 0;
    }


    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }
}
