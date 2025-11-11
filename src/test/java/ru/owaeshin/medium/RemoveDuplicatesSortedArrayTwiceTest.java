package ru.owaeshin.medium;

import org.junit.jupiter.api.Test;
import ru.owaeshin.arrays.RemoveDuplicatesSortedArrayTwice;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesSortedArrayTwiceTest {
    @Test
    void removeDuplicates() {
        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4};

        RemoveDuplicatesSortedArrayTwice removeElement = new RemoveDuplicatesSortedArrayTwice();

        var res = removeElement.removeDuplicates(input);

        System.out.println(Arrays.toString(Arrays.stream(input).toArray()));
        assertEquals(9, res);
    }
}