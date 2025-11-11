package ru.owaeshin.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix2() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix3() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{""};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }


    @Test
    void longestCommonPrefix5() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"", ""};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix4() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"a"};
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
    }

}