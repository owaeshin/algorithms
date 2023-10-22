package ru.owaeshin.arrays;

public class LongestSubarrayDeletingOneElement {
    public int longestSubarray(int[] nums) {
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
        return end - start - 1;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubarrayDeletingOneElement().longestSubarray(new int[]{1,1,0,1}));
        System.out.println(new LongestSubarrayDeletingOneElement().longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        System.out.println(new LongestSubarrayDeletingOneElement().longestSubarray(new int[]{1,1,1}));
    }
}
