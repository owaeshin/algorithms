package ru.owaeshin.arrays;

import java.util.*;

public class KdiffPairsArray {

    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        Set<Integer> uniq = new HashSet<>();
        while (left < right) {
            var diff = nums[right] - nums[left];
            if (diff == k) {
                uniq.add(nums[right]);
                uniq.add(nums[left]);
                left++;
                right = nums.length - 1;
            } else if (diff > k) {
                right--;
            } else {
                break;
            }
        }
        int result;
        if (k == 0) {
            result = uniq.size();
        } else if (uniq.size() % 2 == 0) {
            result = uniq.size() / 2;
        } else {
            result = uniq.size() - 1;
        }
        return result;
    }

    public int findPairsBinary(int[] nums, int k) {
        Set<Integer> uniquePair = new HashSet();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 1; i++)
            if (Arrays.binarySearch(nums, i + 1, n, nums[i] + k) > 0)
                uniquePair.add(nums[i]);

        return uniquePair.size();
    }

    public int findPairsMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int result = 0;
        for (int i : map.keySet())
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
                result++;
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3, 1, 4, 1, 5}, 2)); // 2
        System.out.println(findPairs(new int[]{1, 2, 3, 4, 5}, 1)); // 4
        System.out.println(findPairs(new int[]{1, 2, 3, 4, 5}, 2)); // 3
        System.out.println(findPairs(new int[]{1, 3, 1, 5, 4}, 0)); // 1
        System.out.println(findPairs(new int[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3}, 3)); // 2
    }
}
