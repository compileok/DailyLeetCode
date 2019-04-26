package string;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Stack;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, two is written as II in Roman numeral, just two one's added together.
 * Twelve is written as, XII, which is simply X + II.
 * The number twenty seven is written as XXVII, which is XX + V + II.
 *
 *
 * Example 1:
 *
 * Input: "III"
 * Output: 3
 * Example 2:
 *
 * Input: "IV"
 * Output: 4
 * Example 3:
 *
 * Input: "IX"
 * Output: 9
 *
 *
 */
public class RomanToInteger {

    /**
     * Success
     * Runtime: 9 ms, faster than 71.27% of Java online submissions for Roman to Integer.
     */
    public static int romanToInt(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<s.length();i++) {
            int cur = 0;
            if(s.charAt(i) == 'I') {
                cur = 1;
            }else if(s.charAt(i) == 'V'){
                cur = 5;
            }else if(s.charAt(i) == 'X'){
                cur = 10;
            }else if(s.charAt(i) == 'L'){
                cur = 50;
            }else if(s.charAt(i) == 'C'){
                cur = 100;
            }else if(s.charAt(i) == 'D'){
                cur = 500;
            }else if(s.charAt(i) == 'M'){
                cur = 1000;
            }
            if(stack.isEmpty()){
                stack.push(cur);
                continue;
            }
            if(stack.peek() < cur){
                stack.push(cur-stack.pop());
            }else{
                stack.push(cur);
            }
        }
        int res=0;
        while (!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int res = romanToInt("IV");
        System.out.println(res == 4);
        int res2 = romanToInt("LVIII");
        System.out.println(res2 == 58);
    }
}
