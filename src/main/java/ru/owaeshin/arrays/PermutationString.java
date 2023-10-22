package ru.owaeshin.arrays;

import java.util.Arrays;

public class PermutationString {
    public static void main(String[] args) {
        System.out.println(new PermutationString().checkInclusion("adc", "dcda"));
        System.out.println(new PermutationString().checkInclusion("ab", "eidbaooo"));
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        if (s2.equals(s1)) {
            return true;
        }
        int end = s1.length() - 1;
        String keyS1 = keyStr(s1);
        while (end < s2.length()) {
            String subS2 = s2.substring(end - s1.length() + 1, end + 1);
            var keySubS2 = keyStr(subS2);
            if (keyS1.equals(keySubS2)) {
                return true;
            }
            end++;
        }
        return false;
    }

    private String keyStr(String str) {
        int[] alphas = new int[26];
        for (Character c : str.toCharArray()) alphas[c - 'a'] = alphas[c - 'a'] + 1;
        return Arrays.toString(alphas);
    }
}
