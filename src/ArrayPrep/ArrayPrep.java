package ArrayPrep;

import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
        if (n < 4) {
            return "No";
        }

        for (int i = 0; i <= n - 4; i++) {
            for (int j = i + 1; j <= n - 3; j++) {
                for (int k = j + 1; k <= n - 2; k++) {
                    for (int l = k + 1; l <= n - 1; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            return "Yes";
                        }
                    }

                }
            }
        }
        return "No";
    }

    /*
    * Problem statement
    Alice and Bob always loved to play with arrays. Alice took a sorted array
    * and rotated it clockwise for a certain number of times.

    For example:
    Alice took a sorted array = [4,6,8,10,11] and if she rotates it by 3, then the array becomes: [8, 10, 11, 4, 6].
    After rotating a sorted array, Alice gave a number ‘K’ to Bob and asked him to search for a pair in an array whose sum
    * is equal to K. Since Bob was busy preparing for his semester exams, he asked you to help him.

    You are given an array of integers ARR and a number K.
    * Your task is to find out whether there exists a pair in the array ARR with sum K or not.
    * If there exists a pair then you can return TRUE else return FALSE;
    * */

    public static boolean findPairSum(int[] arr, int target) {
        Arrays.sort(arr);   // sort in place

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                i++;   // move right to increase sum
            } else {
                j--;   // move left to decrease sum
            }
        }
        return false;
    }

    public static boolean pairSumInRotatedArray(int[] arr, int K) {
        int n = arr.length;

        // Step 1: Find pivot (largest element)
        int pivot = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If array is not rotated
        if (pivot == -1) {
            pivot = n - 1;
        }

        int left = (pivot + 1) % n; // smallest element
        int right = pivot;          // largest element

        // Step 2: Two pointer search (circular)
        while (left != right) {
            int sum = arr[left] + arr[right];

            if (sum == K) {
                return true;
            } else if (sum < K) {
                left = (left + 1) % n;
            } else {
                right = (right - 1 + n) % n;
            }
        }
        return false;
    }

    /*
    * Problem statement
    You are given a sorted array A consisting of N integers.
    * Your task is to find the magic index in the given array.

    Note :
    1. A magic index in an array A[0 ... N - 1] is defined to be an index i such that A[i] = i.
    2. The elements in the array can be negative.
    3. The elements in the array can be repeated multiple times.
    4. There can be more than one magic index in an array.
    * */

    public static int magicIndex(ArrayList<Integer> a, int n) {
        // Write your code here
        int limit = Math.min(n, a.size());

        for (int i = 0; i < limit; i++) {
            if (a.get(i) == i) {
                return i;
            }
        }
        return -1;
    }

    /*
    * Problem statement
    You are given an array of integers 'ARR' containing N elements. Each integer is in the range [1, N-1],
    * with exactly one element repeated in the array.

    Your task is to find the duplicate element. The duplicate element may be repeated more
    * than twice in the error, but there will be exactly one element that is repeated in the array.

    Note :

    All the integers in the array appear only once except for precisely one integer which appears two or more times.
    * */

    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) == arr.get(j)) {
                    return arr.get(j);
                }
            }
        }
        return -1;
    }


    /*
    * Reverse String
    * Write a function that reverses a string. The input string is given as an array of characters s.
      You must do this by modifying the input array in-place with O(1) extra memory.
    * */

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    /*
    * Roman to Integer
    *
    Hint
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together.
    * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    * However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.



    Example 1:

    Input: s = "III"
    Output: 3
    Explanation: III = 3.
    Example 2:

    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
    Example 3:

    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


    Constraints:

    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].
    * */

    public int romanToInt(String s) {
        int len = s.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = 1;
            } else if (s.charAt(i) == 'V') {
                arr[i] = 5;
            } else if (s.charAt(i) == 'X') {
                arr[i] = 10;
            } else if (s.charAt(i) == 'L') {
                arr[i] = 50;
            } else if (s.charAt(i) == 'C') {
                arr[i] = 100;
            } else if (s.charAt(i) == 'D') {
                arr[i] = 500;
            } else if (s.charAt(i) == 'M') {
                arr[i] = 1000;
            }
        }
        int sum = 0;
        for (int j = 0; j < len; j++) {
            if (j < len - 1 && arr[j] < arr[j + 1]) {
                sum -= arr[j];
            } else {
                sum += arr[j];
            }
        }
        return sum;
    }

    /*
    * Longest Common Prefix
    *
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".



    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.


    Constraints:

    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters if it is non-empty.
    * */

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Take the first string as reference
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            // Compare this character with same index in other strings
            for (int j = 1; j < strs.length; j++) {
                // If index exceeds length OR character mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        // Entire first string is a common prefix
        return first;
    }

    /*
    * Remove Duplicates from Sorted Array
    *
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element
    *  appears only once. The relative order of the elements should be kept the same.

    Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​.
    * After removing duplicates, return the number of unique elements k.

    The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond
    * index k - 1 can be ignored.

    Custom Judge:

    The judge will test your solution with the following code:

    int[] nums = [...]; // Input array
    int[] expectedNums = [...]; // The expected answer with correct length

    int k = removeDuplicates(nums); // Calls your implementation

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
        assert nums[i] == expectedNums[i];
    }
    If all assertions pass, then your solution will be accepted.



    Example 1:

    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    Example 2:

    Input: nums = [0,0,1,1,1,2,2,3,3,4]
    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).
    * */

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == target) {
                return left;
            } else if (nums[right] == target) {
                return right;
            } else {
                left++;
                right--;
            }
        }
        return -1;
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val && nums[j] != val) {
                nums[i] = nums[j];
                nums[j] = val;
                i++;
                j--;
            } else if (nums[j] == val && nums[i] != val) {
                j--;
                i++;
            } else if (nums[i] == val && nums[j] == val) {
                j--;
            } else if (nums[i] != val && nums[j] != val) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return i;
    }

    /*
    * Search Insert Position
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    * If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.



    Example 1:

    Input: nums = [1,3,5,6], target = 5
    Output: 2
    Example 2:

    Input: nums = [1,3,5,6], target = 2
    Output: 1
    Example 3:

    Input: nums = [1,3,5,6], target = 7
    Output: 4


    Constraints:

    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104
    * */

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    /*
    * Plus One
    *
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the
    * integer. The digits are ordered from most significant to least significant in left-to-right order. The large
    * integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.



    Example 1:

    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].
    Example 2:

    Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
    Incrementing by one gives 4321 + 1 = 4322.
    Thus, the result should be [4,3,2,2].
    Example 3:

    Input: digits = [9]
    Output: [1,0]
    Explanation: The array represents the integer 9.
    Incrementing by one gives 9 + 1 = 10.
    Thus, the result should be [1,0].


    Constraints:

    1 <= digits.length <= 100
    0 <= digits[i] <= 9
    digits does not contain any leading 0's.
    * */

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    /*
    * Merge Sorted Array
    *
    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
    * representing the number of elements in nums1 and nums2 respectively.

    Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should
    * be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
    Example 1:

    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    Example 2:

    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].
    Example 3:

    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    Output: [1]
    Explanation: The arrays we are merging are [] and [1].
    The result of the merge is [1].
    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in
    * nums1.
    * */

    /* Solution 1 */
    /*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }*/

    /* Solution 2 */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k= m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i--];
            }else{
                nums1[k] = nums2[j--];
            }
            k--;
        }
        while (i >= 0) {
            nums1[k] = nums1[i--];
        }
    }

    /*
    * Happy Number
    *
    Write an algorithm to determine if a number n is happy.

    A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does
    * not include 1.
    Those numbers for which this process ends in 1 are happy.
    Return true if n is a happy number, and false if not.
    * */
    public static boolean isHappy(int n) {
        if  (n == 1) {
            return true;
        }
        return false;
    }

    /*
    * Majority Element
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element
    * always exists in the array.



    Example 1:

    Input: nums = [3,2,3]
    Output: 3
    Example 2:

    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
    * */
    public static int majorityElement(int[] nums) {
        return 0;
    }


    /*
    *Contains Duplicate
    *
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if
    * every element is distinct.
    * */

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 2, 3};
        int[] arr2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] arr3 = {4, 3, 2, 1};
        int[] arr4 = {9};
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
//        int[] out = new int[arr1.length];

//        sumOfTwoArrays(arr1, arr2, out);
//        sort012(arr1);
//        pushZerosAtEnd(arr1);
//        intersection(arr1, arr2);

//        System.out.print(Arrays.toString(arr2));
//        System.out.println(removeElement(arr2, 2));
        merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }
}
