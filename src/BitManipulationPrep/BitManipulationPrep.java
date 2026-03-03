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

    /*
    * Single Number
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

    You must implement a solution with a linear runtime complexity and use only constant extra space.
    * */
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
