package br.com.big.o.bigopraticing.algorithm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FibonacciTest {

    @Autowired
    private Fibonacci fibonacci;

    @Test
    void shouldReturnFive(){
        int inputNumber = 5;
        int expectedFibonacci = 5;
        int returnedFibonacci =  this.fibonacci.calculate(inputNumber);

        assertEquals(expectedFibonacci,returnedFibonacci,"Wrong fibonacci interations returned");
    }
}
