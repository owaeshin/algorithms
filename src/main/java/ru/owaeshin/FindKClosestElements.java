package ru.owaeshin;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    //    Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. 
    //    The result should also be sorted in ascending order.
    //
    //    An integer a is closer to x than an integer b if:
    //
    //    |a - x| < |b - x|, or
    //    |a - x| == |b - x| and a < b
    //
    //    Example 1:
    //
    //    Input: arr = [1,2,3,4,5], k = 4, x = 3
    //    Output: [1,2,3,4]
    //    Example 2:
    //
    //    Input: arr = [1,2,3,4,5], k = 4, x = -1
    //    Output: [1,2,3,4]

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (end - start >= k) {
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3)); // [1,2,3,4]
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1)); // [1,2,3,4]
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 2, -1)); // [1,2]
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 1, 1)); // [1]
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 1, 3)); // [3]
        System.out.println(findClosestElements(new int[]{1, 2, 4, 6, 8}, 2, 3)); // [2,4]
        System.out.println(findClosestElements(new int[]{1, 2, 3, 4, 5}, 1, 7)); // [5]
    }
}
