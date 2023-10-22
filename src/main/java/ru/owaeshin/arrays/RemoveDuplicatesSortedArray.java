package ru.owaeshin.arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * <p>
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class RemoveDuplicatesSortedArray {
    //[1,1,2] -> [1,2,_]
    // [1,1,1,1] -> [1,..]
    // [0,0,1,1,1,2,2,3,3,4] -> [0,1,2,3,4,_,_,_,_,_]
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int i = 1;
        while (k < nums.length) {
            if (nums[k] > nums[i - 1]) {
                nums[i++] = nums[k];
            }
            k++;
        }
        return i;
    }
}
