package ru.owaeshin.arrays;

import java.util.Arrays;

import static java.lang.Math.abs;

/**
 * https://leetcode.com/problems/rotate-array
 * <p>
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
class RotateArray {

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 10);
        System.out.println(Arrays.toString(nums));
        int[] nums2 = {-1, -100, 3, 99};
        rotateArray.rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2));
        int[] nums3 = {1, 2, 3};
        rotateArray.rotate(nums3, 4);
        System.out.println(Arrays.toString(nums3));
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int border = (len - k);
        reverse(nums, 0, border - 1);
        reverse(nums, border, len - 1);
        reverse(nums, 0,    len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
