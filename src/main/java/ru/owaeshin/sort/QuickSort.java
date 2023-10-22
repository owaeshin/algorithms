package ru.owaeshin.sort;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int start, int end) {
        if (nums.length == 0 || start >= end) {
            return;
        }
        int mid = (end + start) / 2;
        int i = start, j = end;
        while (i < j) {
            while (nums[i] < nums[mid]) i++;
            while (nums[j] > nums[mid]) j--;
            if (i <= j) {
                int swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (start < j) sort(nums, start, j);
        if (end > i) sort(nums, i, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,1,9,31,4,-1,30,1010,0,-10};
        new QuickSort().quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
