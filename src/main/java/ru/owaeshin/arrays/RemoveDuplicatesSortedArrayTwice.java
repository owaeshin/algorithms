package ru.owaeshin.arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique
 * element appears at most twice. The relative order of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages, you must instead have the result
 * be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesSortedArrayTwice {
    //[1,1,2] -> [1,2,_]
    // [1,1,1,1] -> [1,..]
    // [0,0,0,1,1,1,2,2,3,3,4] -> [0,1,2,3,4,_,_,_,_,_]
    public int removeDuplicates(int[] nums) {
        int previous = nums[0];
        int pSlow = 0;
        int pFast = 1;
        int maxDuplicates = 0;
        while (pFast < nums.length) {
            int fastValue = nums[pFast];
            if (fastValue > previous && maxDuplicates > 1) {
                nums[pSlow] = fastValue;
                pSlow++;
                previous = fastValue;
                maxDuplicates = 1;
            } else if (fastValue == previous) {
                pSlow++;
                maxDuplicates++;
            }
            pFast++;
        }
        return pSlow;
    }
}
