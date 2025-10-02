package ru.owaeshin.arrays;

// https://leetcode.com/problems/multiply-strings/description/
public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int[] products = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + products[p2];

                products[p1] += sum / 10;
                products[p2] = sum % 10;
            }
        }
        var res = new StringBuilder();
        for (int product : products) {
            if (!(product == 0 && res.length() == 0))
                res.append(product);
        }
        return res.length() == 0 ? "0" : res.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("2", "3")); // 6
        System.out.println(multiply("123", "456")); // 56088
        System.out.println(multiply("123", "0")); // 0
        System.out.println(multiply("123456", "12")); // 1481472
        System.out.println(multiply("123456", "789")); // 97406784
    }
}
