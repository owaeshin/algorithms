package ru.owaeshin.arrays;

public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAvg = (double) sum / (double) k;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            double avg = (double) sum / (double) k;
            maxAvg = Math.max(avg, maxAvg);
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumAverageSubarray().findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}
