package string;


/**
 * Write a function that reverses a string.
 * The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 */
public class ReverseString {

    /**
     * Success
     * Runtime:
     *    1 ms, faster than 100.00% of Java online submissions for Reverse String.
     * @param s the input char[] that need to be reverse
     */
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] seed = new char[]{'h','e','l','l','o'};
        System.out.println(seed);
        reverseString(seed);
        System.out.println(seed);
    }

}
