package ru.owaeshin.dp1d;

import java.util.HashMap;
import java.util.Map;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(5));
    }


    // 2 - 1,1 2               2
    // 3 - 1,1,1 - 1,2 - 2,1        3
    // 4 - 1,1,1,1 - 1,1,2 - 1,2,1 -  2,1,1 - 2,2       5
    // 5 - 1,1,1,1,1 - 1,1,1,2 - 2,1,1,1 - 1,2,1,1 - 1,1,2,1 - 2,2,1 - 2,1,2 - 1,2,2 - 8
    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n < 2) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        }
        return memo.get(n);
    }
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return climbStairs(n, map);
    }
}
