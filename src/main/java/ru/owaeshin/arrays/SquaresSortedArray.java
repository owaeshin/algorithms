package ru.owaeshin.arrays;

import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SquaresSortedArray().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(new SquaresSortedArray().sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }

    //Input: nums = [-4,-1,0,3,10]
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 0) {
            return new int[]{};
        }
        int size = nums.length;
        int left = 0;
        int right = size - 1;
        int[] res = new int[nums.length];
        int i = right;
        while (left <= right) {
            if (Math.abs(nums[left]) > nums[right]) {
                res[i--] = nums[left] * nums[left];
                left += 1;
            } else {
                res[i--] = nums[right] * nums[right];
                right -= 1;
            }
        }
        return res;
    }
}
