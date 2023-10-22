package ru.owaeshin.arrays;

public class MaxConsecutiveOnes3 {
    public int longestOnes1(int[] nums, int k) {
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        int maxSum = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            for (int j = i + 1; j < nums.length + 1; j++) {
                var currSum = sum[j] - sum[i];
                if (currSum > maxSum && currSum + k == j - i) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum + k;
    }
    public int longestOnes(int[] nums, int k) {
        int zeroCounter = 0;
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            if (nums[end] == 0) {
                zeroCounter++;
            }
            end++;
            if (zeroCounter > k) {
                if (nums[start] == 0) {
                    zeroCounter--;
                }
                start++;
            }
        }
        return end - start;
    }

    public static void main(String[] args) {
        System.out.println(new MaxConsecutiveOnes3().longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(new MaxConsecutiveOnes3().longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}
