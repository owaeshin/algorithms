package ru.owaeshin.arrays;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(nums));
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{0, 0, 0, 3, 12, 0};
        System.out.println(Arrays.toString(nums));
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int swapPointer = i + 1;
                while (swapPointer < nums.length && nums[swapPointer] == 0) {
                    swapPointer++;
                }
                if (swapPointer < nums.length) swap(nums, i, swapPointer);
            }
        }
    }

    private void swap(int[] nums, int l, int r) {
        var buff = nums[l];
        nums[l] = nums[r];
        nums[r] = buff;
    }
}
