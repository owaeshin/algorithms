package ru.owaeshin.arrays;

import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(1 ^ 6 ^ 132 ^ 123 ^ 6 ^ 1 ^ 123);
        System.out.println(1 ^ 1);
        System.out.println(1 ^ 0);
        System.out.println(0 ^ 1);
        System.out.println(6 ^ 1);
        System.out.println(653 ^ 134);
        System.out.println(new MissingNumber().missingNumber2(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public int missingNumber(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length + 1; i++) {
            numbers.add(i);
        }
        for (int num : nums) {
            numbers.remove(num);
        }
        return numbers.iterator().next();
    }

    public int missingNumber2(int[] nums) { //xor
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }
}
