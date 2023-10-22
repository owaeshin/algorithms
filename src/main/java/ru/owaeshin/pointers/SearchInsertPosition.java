package ru.owaeshin.pointers;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3}, 2));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{}, 5));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1}, 5));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{2}, 1));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int mid = 0;
        int left = 0;
        int right = nums.length;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            } else {
                return mid;
            }
        }
        return left;
    }
}
