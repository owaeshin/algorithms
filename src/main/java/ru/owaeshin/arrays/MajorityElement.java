package ru.owaeshin.arrays;

import java.util.HashMap;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for (int key : nums) {
            if (map.containsKey(key)) {
                var val = map.get(key) + 1;
                map.put(key, val);
                if (val > nums.length / 2) {
                    return key;
                }
            } else {
                map.put(key, 1);
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        System.out.println(7/2);
    }
}
