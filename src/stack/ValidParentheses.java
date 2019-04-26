package stack;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *  1. Open brackets must be closed by the same type of brackets.
 *  2. Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * example1: input ()      output true
 * example2: input ()[]{}  output true
 * example3: input (]      output false
 *
 */
public class ValidParentheses {


    /**
     * 2 ms, faster than 86.83% of Java online submissions for Valid Parentheses.
     */
    public static boolean isValid(String s) {

        if(s == null) {
            return false;
        }

        Stack<String> stack = new Stack();
        char[] elements = s.toCharArray();

        for(char c : elements) {
            if(stack.isEmpty()) {
                stack.push(String.valueOf(c));
                continue;
            }
            if(String.valueOf(c).equals("]") && stack.peek().equals("[")) {
                stack.pop();
            }else if(String.valueOf(c).equals("}") && stack.peek().equals("{")) {
                stack.pop();
            }else if(String.valueOf(c).equals(")") && stack.peek().equals("(")) {
                stack.pop();
            }else {
                stack.push(String.valueOf(c));
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isValid("()"));      // true
        System.out.println(isValid("[)"));      // false
        System.out.println(isValid("({})[]{}"));// true


    }

}
