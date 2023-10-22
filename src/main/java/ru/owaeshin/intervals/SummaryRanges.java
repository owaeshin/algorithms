package ru.owaeshin.intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(new SummaryRanges().summaryRanges(new int[]{0}));
        System.out.println(new SummaryRanges().summaryRanges(new int[]{0, 1}));
        System.out.println(new SummaryRanges().summaryRanges(new int[]{0, 2}));
        System.out.println(new SummaryRanges().summaryRanges(new int[]{0, 1, 3}));
        System.out.println(new SummaryRanges().summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(new SummaryRanges().summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1])
                i++;
            if (start != nums[i]) {
                al.add(start + "->" + nums[i]);
            } else {
                al.add(String.valueOf(start));
            }
        }
        return al;
    }
}
