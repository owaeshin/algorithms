package ru.owaeshin.arrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();
        Deque<Character> buff = new ArrayDeque<>();
        int maxLen = 0;
        for (char c : s.toCharArray()) {
            if (buff.contains(c)) {
                while (!buff.getFirst().equals(c)) {
                    buff.removeFirst();
                }
                buff.removeFirst();
                buff.addLast(c);
            } else {
                buff.addLast(c);
            }
            if (buff.size() > maxLen) {
                maxLen = buff.size();
            }
        }
        return maxLen;
    }

    public int lengthOfLongestSubstringSet(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstringSet("abcddevj"));
    }
}
