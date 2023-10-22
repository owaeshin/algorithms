package ru.owaeshin.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(new int[]{30, 40, 50, 60})));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] temps = new int[temperatures.length];
        Stack<List<Integer>> tempsAll = new Stack<>();
        int counter = 0;
        for (int i = temperatures.length - 1; i >= 0; i--) {
            var curr = temperatures[i];
            while (!tempsAll.isEmpty()) {
                var tempInStack = tempsAll.pop();
                if (tempInStack.get(1) > curr) {
                    temps[i] = tempInStack.get(0) - i;
                    tempsAll.push(tempInStack);
                    break;
                }
            }
            if (tempsAll.isEmpty()) {
                temps[i] = 0;
            }
            tempsAll.push(List.of(i, curr));
        }
        return temps;
    }
}
