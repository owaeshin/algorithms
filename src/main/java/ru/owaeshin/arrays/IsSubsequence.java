package ru.owaeshin.arrays;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int counter = 0;
        for (Character character : t.toCharArray()) {
            if (counter < s.length() && character == s.charAt(counter)) {
                counter++;
            }
        }
        return counter == s.length();
    }

    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("ahbgdc", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("b", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
    }
}
