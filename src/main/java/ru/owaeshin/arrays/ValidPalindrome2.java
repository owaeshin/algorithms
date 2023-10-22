package ru.owaeshin.arrays;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome2().validPalindrome("ebcbbececabbacecbbcbe"));
        System.out.println(new ValidPalindrome2().validPalindrome("eeccccbebaeeabebccceea"));
        System.out.println(new ValidPalindrome2().validPalindrome("aba"));
        System.out.println(new ValidPalindrome2().validPalindrome("abca"));
        System.out.println(new ValidPalindrome2().validPalindrome("absbca"));
        System.out.println(new ValidPalindrome2().validPalindrome("abc"));
    }

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrom(s.substring(left + 1, right + 1)) ||
                        isPalindrom(s.substring(left, right));
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrom(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
