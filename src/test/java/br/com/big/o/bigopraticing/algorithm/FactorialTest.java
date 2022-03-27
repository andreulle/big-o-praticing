package br.com.big.o.bigopraticing.algorithm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FactorialTest {

    @Autowired
    private Factorial factorial;

    @Test
    void shouldReturnSix(){
        int inputNumber = 3;
        int expectedFatorial = 6;

        int returnedFactorial = this.factorial.calculate(inputNumber);

        assertEquals(expectedFatorial,returnedFactorial,"The factorial number is incorrect");
    }

    @Test
    void shouldReturnFortyThousandThreeHundredTwenty(){
        int inputNumber = 8;
        int expectedFatorial = 40320;

        int returnedFactorial = this.factorial.calculate(inputNumber);

        assertEquals(expectedFatorial,returnedFactorial,"The factorial number is incorrect");
    }

    @Test
    void shouldReturnZero(){
        int inputNumber = 0;
        int expectedFatorial = 0;

        int returnedFactorial = this.factorial.calculate(inputNumber);

        assertEquals(expectedFatorial,returnedFactorial,"The factorial number is incorrect");
    }
}
