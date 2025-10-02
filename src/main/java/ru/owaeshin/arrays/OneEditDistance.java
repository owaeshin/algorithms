package ru.owaeshin.arrays;

public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (Math.abs(sLen - tLen) > 1) {
            return false;
        }
        int i = 0, j = 0;
        int counter = 0;
        while (i < sLen && j < tLen) {
            if (s.charAt(i) != t.charAt(j)) {
                if (counter == 1) {
                    return false;
                }
                if (sLen > tLen) {
                    i++;
                } else if (tLen > sLen) {
                    j++;
                } else {
                    i++;
                    j++;
                }
                counter++;
            } else {
                i++;
                j++;
            }
        }
        if (i < sLen || j < tLen) counter++;

        return counter < 2;
    }

    public static void main(String[] args) {
        System.out.println(new OneEditDistance().isOneEditDistance("abc", "abc"));
        System.out.println(new OneEditDistance().isOneEditDistance("abc", "absc"));
        System.out.println(new OneEditDistance().isOneEditDistance("abc", "ab"));
        System.out.println(new OneEditDistance().isOneEditDistance("abd", "abc"));
        System.out.println(new OneEditDistance().isOneEditDistance("1203", "1213"));
        System.out.println(new OneEditDistance().isOneEditDistance("1203", "12134"));
    }
}
