package ru.owaeshin.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("("));
        System.out.println(new ValidParentheses().isValid("){"));
        System.out.println(new ValidParentheses().isValid("([]"));
        System.out.println(new ValidParentheses().isValid("()"));
        System.out.println(new ValidParentheses().isValid("()[]{}"));
        System.out.println(new ValidParentheses().isValid("[}"));
        System.out.println(new ValidParentheses().isValid("([)]"));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        var map = new HashMap<Character, Character>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && stack.lastElement() == map.get(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
