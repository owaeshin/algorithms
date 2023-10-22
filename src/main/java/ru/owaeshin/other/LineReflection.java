package ru.owaeshin.other;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LineReflection {
    public boolean isReflected(int[][] points) {
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        Set<List<Integer>> pointSet = new HashSet<>();
        for (int[] p : points) {
            minX = Math.min(minX, p[0]);
            maxX = Math.max(maxX, p[0]);
            pointSet.add(List.of(p[0], p[1]));
        }
        int s = minX + maxX;
        for (int[] p : points) {
            if (!pointSet.contains(List.of(s - p[0], p[1]))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new LineReflection().isReflected(new int[][]{});
    }
}
