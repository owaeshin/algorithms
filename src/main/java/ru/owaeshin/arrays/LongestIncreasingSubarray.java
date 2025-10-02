package ru.owaeshin.arrays;

import java.util.Arrays;

public class LongestIncreasingSubarray {
    /*
Дан массив чисел a_1, a_2, ..., a_n.
Необходимо найти монотонный подотрезок (то есть строго убывающий или строго возрастающий) максимальной длины и 
вернуть пару индексов его начала и конца.

Примеры:
[2, 7, 5, 4, 4, 3] -> [1, 3]
[1, 1] -> {1, 1} // or [0, 0]
*/
    static int[][] tests_lengthOfLIS = new int[][]{
            new int[]{10, 9, 2, 5, 3, 7, 101, 18}, //4
            new int[]{0, 1, 0, 3, 2, 3}, // 4
            new int[]{7, 7, 7, 7} // 1
    };
    static int[][] tests_maxMonotonic = new int[][]{
            new int[]{1, 1}, // -> {0, 0}
            new int[]{2, 7, 5, 4, 4, 3}, // -> {1, 3}
            new int[]{2, 2, 2, 1, 1, 3}, // -> {2, 3} or {4, 5}
            new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, // -> {0, 8}
            new int[]{1, 2, 3, 4, 3, 2, 1, 8, 9, 10, 11}, // -> {6, 10}
            new int[]{1, 2, 3, 3, 3, 2, 3, 4, 5, 6, 8, 9, 10, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, // -> {13, 23}
    };

    public static void main(String[] args) {
//        Arrays.stream(tests_lengthOfLIS).forEach(test -> System.out.println(lengthOfLIS(test)));
        Arrays.stream(tests_maxMonotonic).forEach(test -> System.out.println(Arrays.toString(maxMonotonic(test))));
    }

    private static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return Arrays.stream(dp).max().orElse(0);
    }

    private static int[] maxMonotonic(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{0,0};
        }

        int[] maxIncrease = findIndSub(nums, true);
        int[] maxDecrease = findIndSub(nums, false);
        if (maxDecrease[1] - maxDecrease[0] > maxIncrease[1] - maxIncrease[0]) {
            return maxDecrease;
        }
        return maxIncrease;
    }
    
    private static int[] findIndSub(int[] nums, boolean increase) {
        int n = nums.length;
        int currLen = 0;
        int beginInd = 0;
        int endInd = 0;
        int maxBeginInd = 0;
        int maxEndInd = 0;
        int[] max = new int[2];
        for (int i = 0; i < n - 1; i++) {
            boolean predicate = increase ? nums[i] < nums[i + 1] : nums[i] > nums[i + 1];
            if (predicate) {
                currLen++;
                endInd = i + 1;
            } else {
                if (currLen > maxEndInd - maxBeginInd) {
                    maxBeginInd = beginInd;
                    maxEndInd = endInd;
                }
                beginInd = i + 1;
            }
        }
        if (currLen > maxEndInd - maxBeginInd) {
            maxBeginInd = beginInd;
            maxEndInd = endInd;
        }
        max[0] = maxBeginInd;
        max[1] = maxEndInd;
        return max;
    }
}
