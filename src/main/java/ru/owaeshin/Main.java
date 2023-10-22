package ru.owaeshin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int perest(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count *= i;
        }
        return count;
    }
}