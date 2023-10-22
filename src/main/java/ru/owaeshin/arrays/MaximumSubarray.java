package ru.owaeshin.arrays;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            } else if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
