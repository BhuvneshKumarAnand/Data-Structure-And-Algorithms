package StringsPrep;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.*;


public class StringsPrep {

    /*
    * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    * determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
    * */
    public static boolean isValid(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                if ((stack.peek() == '(' && c == ')') ||
                        (stack.peek() == '[' && c == ']') ||
                        (stack.peek() == '{' && c == '}')
                ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /*
    * Find the Index of the First Occurrence in a String
    *
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
    * or -1 if needle is not part of haystack.
    Example 1:

    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.
    Example 2:

    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
    Explanation: "leeto" did not occur in "leetcode", so we return -1.
    * */

    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Generate all substrings
     * */
    public static void printAllSubStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    /*
    * Valid Palindrome
    *
    A phrase is a palindrome if, after converting all uppercase letters into lowercase
    * letters and removing all non-alphanumeric characters, it reads the same forward
    * and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.



    Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    Example 2:

    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
    Example 3:

    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.


    Constraints:

    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.
    * */

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(sb.toString());

        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /*
    * Length of Last Word
    *
    Given a string s consisting of words and spaces, return the length of the last word in the string.

    A word is a maximal substring consisting of non-space characters only.



    Example 1:

    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.
    Example 2:

    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.
    Example 3:

    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.


    Constraints:

    1 <= s.length <= 104
    s consists of only English letters and spaces ' '.
    There will be at least one word in s.
    * */

    public static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                length++;
            } else if (Character.isWhitespace(ch) && length != 0) {
                break;
            }
        }
        return length;
    }

    /*
    * Excel Sheet Column Title
    *
    Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

    For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...


    Example 1:

    Input: columnNumber = 1
    Output: "A"
    Example 2:

    Input: columnNumber = 28
    Output: "AB"
    Example 3:

    Input: columnNumber = 701
    Output: "ZY"


    Constraints:

    1 <= columnNumber <= 231 - 1
    * */

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            sb.append((char) ('A' + remainder));
            columnNumber /= 26;
        }

        return sb.reverse().toString();

    }

    /*
    * Excel Sheet Column Number
    *
    Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

    For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...


    Example 1:

    Input: columnTitle = "A"
    Output: 1
    Example 2:

    Input: columnTitle = "AB"
    Output: 28
    Example 3:

    Input: columnTitle = "ZY"
    Output: 701


    Constraints:

    1 <= columnTitle.length <= 7
    columnTitle consists only of uppercase English letters.
    columnTitle is in the range ["A", "FXSHRXW"].
    * */

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            result = (ch - 'A' + 1) + 26 * result;
        }
        return result;
    }

    /*
     * Convert Binary To Decimal
     * */
    public static int convertBinaryToDecimal(String str) {
        int length = str.length();
        int result = 0;
        int k = 0;
        for (int i = length - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '1') {
                result += (int) Math.pow(2, k);
            }
            k++;
        }
        return result;
    }

    /*
     * Convert Decimal to Binary
     * */
    public static String convertDecimalToBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int remainder = num % 2;
            num = num / 2;
            sb.append(remainder);
        }
        return sb.reverse().toString();
    }


    /*
    * Add Binary
    *
    Given two binary strings a and b, return their sum as a binary string.



    Example 1:

    Input: a = "11", b = "1"
    Output: "100"
    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101"


    Constraints:

    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.
    * */

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }

    /*
    * Reverse Vowels of a String
    *
    Given a string s, reverse only all the vowels in the string and return it.

    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



    Example 1:

    Input: s = "IceCreAm"

    Output: "AceCreIm"

    Explanation:

    The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

    Example 2:

    Input: s = "leetcode"

    Output: "leotcede"



    Constraints:

    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.
    * */

    public static String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr = s.toCharArray();
        while (left<right) {

            while (left < right && !isVowel(arr[left])){
                left++;
            }
            while (left < right && !isVowel(arr[right])){
                right--;
            }

            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return  new String(arr);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U';
    }

    /*
    * Add Strings
    *
    Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

    You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.



    Example 1:

    Input: num1 = "11", num2 = "123"
    Output: "134"
    Example 2:

    Input: num1 = "456", num2 = "77"
    Output: "533"
    Example 3:

    Input: num1 = "0", num2 = "0"
    Output: "0"


    Constraints:

    1 <= num1.length, num2.length <= 104
    num1 and num2 consist of only digits.
    num1 and num2 don't have any leading zeros except for the zero itself.
    * */

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i1 = num1.length() - 1;
        int i2 = num2.length() - 1;
        int carry = 0;
        while (i1 >= 0 || i2 >= 0  || carry != 0) {
            int d1 = (i1 >= 0) ? num1.charAt(i1) - '0' : 0;
            int d2 = (i2 >= 0) ? num2.charAt(i2) - '0' : 0;

            int sum = d1 + d2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);

            i1--;
            i2--;
        }
        return sb.reverse().toString();
    }


    /*
    * String to Integer (atoi)
    *
    Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

    The algorithm for myAtoi(string s) is as follows:

    Whitespace: Ignore any leading whitespace (" ").
    Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
    Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the
    * string is reached. If no digits were read, then the result is 0.
    Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to
    * remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater
    * than 231 - 1 should be rounded to 231 - 1.
    Return the integer as the final result.
    * */
    public static int myAtoi(String s) {
        int i = 0, n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3. Convert digits
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Handle overflow BEFORE multiplying
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    /*
    * Integer to Roman
    *
    Seven different symbols represent Roman numerals with the following values:

    Symbol	Value
    I	1
    V	5
    X	10
    L	50
    C	100
    D	500
    M	1000
    Roman numerals are formed by appending the conversions of decimal place values from highest to lowest.
    * Converting a decimal place value into a Roman numeral has the following rules:

    If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the
    * input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
    If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following
    * symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following
    * subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
    Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10.
    * You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the
    * subtractive form.
    Given an integer, convert it to a Roman numeral.
    * */
    public static String intToRoman(int num) {
        return "";
    }


    public static void main(String[] args) {
        System.out.println(intToRoman(42));
    }
}
