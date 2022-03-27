package br.com.big.o.bigopraticing.algorithm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MergeSortTest {

    @Autowired
    private MergeSort mergeSort;

    @Test
    void shouldReturnOrdenedArray(){
        int[] unordenedArrayInput = {2,1,3,5,7,4,6,17,9};
        int[] ordenedArrayExpected = {1,2,3,4,5,6,7,9,17};

        int[] returnedArray = this.mergeSort.sort(unordenedArrayInput);

        assertTrue(Arrays.equals(ordenedArrayExpected, returnedArray), "The array is not ordened as expected");
    }

    @Test
    void shouldReturnOrdenedArrayWithGreatestNumberOnLeft(){
        int[] unordenedArrayInput = {2,18,1,3,5,7,4,6,17,9};
        int[] ordenedArrayExpected = {1,2,3,4,5,6,7,9,17,18};

        int[] returnedArray = this.mergeSort.sort(unordenedArrayInput);

        assertTrue(Arrays.equals(ordenedArrayExpected, returnedArray), "The array is not ordened as expected");
    }
}
