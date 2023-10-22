package ru.owaeshin.easy;

import org.junit.jupiter.api.Test;
import ru.owaeshin.arrays.RemoveDuplicatesSortedArray;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesSortedArrayTest {

    @Test
    void removeDuplicates() {
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicatesSortedArray removeElement = new RemoveDuplicatesSortedArray();

        var res = removeElement.removeDuplicates(input);

        System.out.println(Arrays.toString(Arrays.stream(input).toArray()));
        assertEquals(5, res);
    }
}