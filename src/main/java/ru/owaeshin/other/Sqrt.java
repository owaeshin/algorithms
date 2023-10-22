package ru.owaeshin.other;

public class Sqrt {
    public int mySqrt(int x) {
        int i = 0;
        while (true) {
            if (i * i >= x) {
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Sqrt().mySqrt(4));
        System.out.println(new Sqrt().mySqrt(8));
        System.out.println(new Sqrt().mySqrt(16));
        System.out.println(new Sqrt().mySqrt(9));
        System.out.println(new Sqrt().mySqrt(256));
    }
}
