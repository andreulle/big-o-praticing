package br.com.big.o.bigopraticing.algorithm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.springframework.util.Assert.isTrue;

@SpringBootTest
public class BinarySearchTest {

    @Autowired
    private BinarySearch binarySearch;

    @Test
    void shouldReturnPositionTwo(){
        int[] inputData = {1,2,3,4,5,6,7,8,9,10};
        int targetNumber = 3;
        int expectedPosition = 2;

        int returnedPosition = this.binarySearch.search(targetNumber, inputData);

        isTrue(returnedPosition == expectedPosition, "The position is correct");
    }

    @Test
    void shouldReturnPositionSix(){
        int[] inputData = {1,2,3,4,5,6,7,8,9,10};
        int targetNumber = 7;
        int expectedPosition = 6;

        int returnedPosition = this.binarySearch.search(targetNumber, inputData);

        isTrue(returnedPosition == expectedPosition, "The position is correct");
    }
}
