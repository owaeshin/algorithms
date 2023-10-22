package ru.owaeshin.pointers;

public class Palindrome {
    public static void main(String[] args) {
        var str = "1A man, a plan, a canal: Panama1";
        System.out.println(new Palindrome().isPalindrome(1000030001));
        System.out.println(new Palindrome().isPalindrome(1000000001));
        System.out.println(new Palindrome().isPalindrome(123321));
        System.out.println(new Palindrome().isPalindrome(88888));
        System.out.println(new Palindrome().isPalindrome(str));
        System.out.println(new Palindrome().isPalindrome(123));
        System.out.println(new Palindrome().isPalindrome(-121));
        System.out.println(new Palindrome().isPalindrome(1));
    }

    public boolean isPalindrome(String s) {
        var str = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
        var len = str.length();
        if (len == 0) {
            return true;
        }
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int index = x;
        int counter = 0;
        while (index > 0) {
            index = index / 10;
            counter++;
        }
        int len = counter / 2 + 1;
        for (int i = 1; i < len; i++) {
            int left = (x / (int) (Math.pow(10, counter - 1))) % 10;
            int right = (int) (x % (Math.pow(10, i))) / (int) Math.pow(10, i - 1);
            if (left != right) {
                return false;
            }
            counter--;
        }
        return true;
    }
}
