package ru.owaeshin.arrays;

public class SubarraySumEqualsK {

    public static void main(String[] args) {

        System.out.println(new SubarraySumEqualsK().subarraySum(new int[]{-1, -1, 1}, 0));
        System.out.println(new SubarraySumEqualsK().subarraySum(new int[]{1, -1, 0}, 0));
        System.out.println(new SubarraySumEqualsK().subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(new SubarraySumEqualsK().subarraySum(new int[]{1, 1, 1, 2, 5, 5, 4, 2, 1, 1}, 2));
        System.out.println(new SubarraySumEqualsK().subarraySum(new int[]{1, 2, 3}, 3));
    }

    public int subarraySum(int[] nums, int k) {
        int counter = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = i + 1; j < sum.length; j++) {
                if (sum[j] - sum[i] == k) {
                    counter++;
                }
            }

        }
        return counter;
    }
}
