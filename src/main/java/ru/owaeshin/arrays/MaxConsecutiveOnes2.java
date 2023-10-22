package ru.owaeshin.arrays;

public class MaxConsecutiveOnes2 {
    public static void main(String[] args) {
        System.out.println(new MaxConsecutiveOnes2().longestOnes(new int[]{1, 1, 0, 1, 0, 0, 1, 0}));
        System.out.println(new MaxConsecutiveOnes2().longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}));
        System.out.println(new MaxConsecutiveOnes2().longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}));
    }

    public int longestOnes(int[] nums) {
        int zeroCounter = 0;
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            if (nums[end] == 0) {
                zeroCounter++;
            }
            end++;
            if (zeroCounter > 1) {
                if (nums[start] == 0) {
                    zeroCounter--;
                }
                start++;
            }
        }
        return end - start;
    }
}
