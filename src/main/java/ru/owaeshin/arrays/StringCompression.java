package ru.owaeshin.arrays;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        var s = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(new StringCompression().compress(s));
        System.out.println(Arrays.toString(s));
        s = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(new StringCompression().compress(s));
        System.out.println(Arrays.toString(s));
        s = new char[]{'a', 'b', 'c'};
        System.out.println(new StringCompression().compress(s));
        System.out.println(Arrays.toString(s));
    }

    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        var putIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            int counter = 1;
            while (i < chars.length - 1 &&  chars[i] == chars[i + 1]) {
                i++;
                counter++;
            }
            chars[putIndex++] = chars[i];
            if (counter > 1) {
                char[] counters = String.valueOf(counter).toCharArray();
                for (char c : counters) {
                    chars[putIndex++] = c;
                }
            }
        }
        return putIndex;
    }
}
