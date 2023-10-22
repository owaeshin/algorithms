package ru.owaeshin.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Example 1:
 * <p>
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }
//        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        sort(intervals, 0, intervals.length - 1);
        int start = 0;
        int end = 0;
        int place = 0;
        int[][] result = new int[intervals.length][2];
        for (int i = 1; i < intervals.length; i++) {
            var currStart = intervals[i][0];
            var currEnd = intervals[i][1];
            if (currStart > intervals[end][1]) {
                result[place++] = new int[]{intervals[start][0], intervals[end][1]};
                start = i;
            }
            if (currEnd > intervals[end][1]) {
                end = i;
            }
            if (i == intervals.length - 1) {
                result[place++] = new int[]{intervals[start][0], intervals[end][1]};
            }
        }
        return Arrays.copyOf(result , place);
    }

    private void sort(int[][] nums, int start, int end) {
        if (nums.length == 0 || start >= end) {
            return;
        }
        int mid = (end + start) / 2;
        int i = start, j = end;
        while (i < j) {
            while (nums[i][0] < nums[mid][0]) i++;
            while (nums[j][0] > nums[mid][0]) j--;
            if (i <= j) {
                int[] buff = nums[i];
                nums[i] = nums[j];
                nums[j] = buff;
                i++;
                j--;
            }
        }

        if (start < j) sort(nums, start, j);
        if (end > i) sort(nums, i, end);
    }
}
