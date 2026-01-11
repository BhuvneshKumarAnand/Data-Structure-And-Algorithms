package ArrayPrep;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPrep {
    /*
    * Sum of Two Arrays
    *
Problem statement

Send feedback
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.

You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.

Note:
The sizes N and M can be different.

Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry.

No need to print the elements of the output array/list.
Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9
Sample Output 2:
0 8 6 5
1 0 2 2 0
    * */
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = output.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += arr1[i--];
            if (j >= 0) sum += arr2[j--];

            output[k--] = sum % 10;
            carry = sum / 10;
        }

        // print the result
        for (int val : output) {
            System.out.print(val + " ");
        }
    }


    /* Problem statement
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.

'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.

Note:
1. You need to change in the given array/list itself. Hence, no need to return or print anything.
2. You are not allowed to sort the list/array directly. */
    public static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++; // leave 1s in the middle
            } else { // arr[mid] == 2
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    /* Problem statement
You have been given a random integer array/list(ARR) of size N. You have been required to push all the zeros that are present in the array/list to the end of it. Also, make sure to maintain the relative order of the non-zero elements.

Note:
Change in the input array/list itself. You don't need to return or print the elements.

You need to do this in one scan of array only. Don't use extra space. */

    public static void pushZerosAtEnd(int[] arr) {
        int n = arr.length;
        int nonZeroPos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i != nonZeroPos) {
                    int temp = arr[i];
                    arr[i] = arr[nonZeroPos];
                    arr[nonZeroPos] = temp;
                }
                nonZeroPos++;
            }
        }
    }

    /* Problem statement
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in ascending order. */

    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        int n = arr1.length;
        int m = arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr1[i] = arr2[j] = -1;
                }
            }
        }

    }

    /* Problem statement
For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.

Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.

If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.

Example:
Let's consider an array/list Arr = [2, 3, 10, -10, 4, 2, 9]  of size, N = 7.

There exist three equilibrium indices, one at 2, another at 3, and another at 5.

At index 2, the sum of all the elements to the left, [2 + 3] is 5, and the elements to its right, [-10 + 4 + 2 + 9] is also 5. Hence index 2 is an equilibrium index according to the condition we want to achieve. Mind it that we haven't included the item at index 2, which is 10, to either of the parts.

Similarly, we can see at index 3 and 5, the elements to its left sum up to 15 and 9 respectively and to the right, sum up to 15 and 9 respectively either.  */


    public static int arrayEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;  // equilibrium index found
            }
            leftSum += arr[i];
        }

        return -1;  // no equilibrium index
    }


    public static int tripletSum(int[] arr, int num) {
        //Your code goes here
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == num) {
                        count++;
                    }
                }
            }
        }
        return count;

    }

    /*
     * Problem statement
     * You have been given an integer array/list(ARR) and a number 'num'.
     * Find and return the total number of pairs in the array/list which sum to 'num'.
     * Note: Given array/list can contain duplicate elements.
     * */

    public static int pairSum(int[] arr, int num) {
        //Your code goes here
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == num) {
                    count++;
                }
            }
        }

        return count;
    }

    /*
     * Problem statement
     * You are given an array/list 'ARR' of ‘N’ integers and an integer value ‘TARGET’.
     * You need to check whether there exist four numbers
     * (ARR[i], ARR[j], ARR[k], ARR[l]) such that (0 <= i < j < k < l < N)
     * and ARR[i] + ARR[j] + ARR[k] + ARR[l] = 'TARGET'.
     * Note:
     * 1. All four numbers should exist at different indices in the given array.
     * 2. The answer is case-sensitive.
     * */

    public static String fourSum(int[] arr, int target, int n) {
        // Write your code here.
        if(n<4){
            return "No";
        }

        for (int i = 0; i <= n-4; i++) {
            for (int j = i+1; j <= n-3; j++) {
                for (int k = j+1; k <= n-2; k++) {
                    for (int l = k+1; l <= n-1; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            return "Yes";
                        }
                    }

                }
            }
        }
        return "No";
    }


    public static void main(String[] args) {
        int[] arr1 = {0, 6, 0, 0};
//        int[] arr2 = {1, 2, 3, 4};
//        int[] out = new int[arr1.length];

//        sumOfTwoArrays(arr1, arr2, out);
//        sort012(arr1);
//        pushZerosAtEnd(arr1);
//        intersection(arr1, arr2);

        System.out.println(pairSum(arr1, 6));
    }
}
