package string;


/**
 * Count the number of segments in a string,
 * where a segment is defined to be a contiguous sequence of non-space characters.
 *
 * Please note that the string does not contain any non-printable characters.
 *
 * Example:
 *
 * Input: "Hello, my name is John"
 * Output: 5
 */
public class NumberOfSegmentsInString {


    /**
     * Success
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
     * @param s  the string
     * @return number of segments in the string 's'
     */
    public static int countSegments(String s) {
        if(s == null) {
            return 0;
        }
        int res = 0,find = 0;
        char[] chars = s.toCharArray();
        for(int i = 0;i < chars.length; i++ ) {
            if(chars[i] != ' ') {
                find ++;
            }else if(chars[i] == ' ' && find > 0) {
                res ++;
                find = 0;
            }
        }
        if(find > 0 ) {
            res++;
        }
        return res;
    }


    public static void main(String[] args) {
        int n = countSegments(" Hello, my name is John ");
        System.out.println( n == 5);
    }

}
