package ru.owaeshin.easy;

import org.junit.jupiter.api.Test;
import ru.owaeshin.arrays.RemoveElement;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void remove_1() {
        int[] input = new int[]{3,2,2,3};

        RemoveElement removeElement = new RemoveElement();

        var res = removeElement.removeElement(input, 3);

        assertEquals(2, res);
        assertArrayEquals(new int[]{2,2,0,0}, input);
    }

    @Test
    void remove_2() {
        int[] input = new int[]{0,1,2,2,3,0,4,2};

        RemoveElement removeElement = new RemoveElement();

        var res = removeElement.removeElement(input, 2);

        assertEquals(5, res);
        assertArrayEquals(new int[]{0,1,4,0,3,0,0,0}, input);
    }


    @Test
    void remove_3() {
        int[] input = new int[]{1};
        RemoveElement removeElement = new RemoveElement();

        var res = removeElement.removeElement(input, 1);

        assertEquals(1, res);
        assertArrayEquals(new int[]{}, input);
    }

}