package ru.owaeshin.arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
// [3,2,2,3], val = 3
// i = 0, k = 3 -> 3 == 3 -> 3 != 3 -> nums[3] = 0 k--
// i = 0, k = 2 -> 3 == 3 -> 3 != 2 -> nums[0] = nums[2] = 2, i++; nums[2] = 0, k--;
// i = 1, k = 1 -> return 2;