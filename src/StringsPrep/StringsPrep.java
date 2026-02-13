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
            if (Character.isLetterOrDigit(ch)){
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
        int length =0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch =  s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                length++;
            } else if (Character.isWhitespace(ch) && length != 0) {
                break;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
