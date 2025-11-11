package ru.owaeshin.other;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            prefix += strs[0].charAt(i);
            if (!isPrefix(prefix, strs)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                break;
            }
        }
        return prefix;
    }

    private boolean isPrefix(String prefix, String[] strs) {
        return Arrays.stream(strs).allMatch(str -> str.startsWith(prefix));
    }
}
