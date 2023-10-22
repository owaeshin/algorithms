package ru.owaeshin.slidingwindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        var arr = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(7, arr));
    }

    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, k = 0, sum =0,  res = Integer.MAX_VALUE;
        while (k < nums.length) {
            sum += nums[k++];
            while (sum >= target) {
                res = Math.min(res, k - i);
                sum -= nums[i++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
