package ru.owaeshin.arrays;

public class GreatestCommonDivisorStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        var end = gcd(str1.length(), str2.length());
        return str1.substring(0, end);
    }

    private int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new GreatestCommonDivisorStrings().gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(new GreatestCommonDivisorStrings().gcdOfStrings("ABCABC", "ABC"));
        System.out.println(new GreatestCommonDivisorStrings().gcdOfStrings("ABCABCAB", "ABC"));
        System.out.println(new GreatestCommonDivisorStrings().gcdOfStrings("ABCABCAB", "ABC"));
    }
}
