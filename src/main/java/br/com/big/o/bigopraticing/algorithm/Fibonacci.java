package br.com.big.o.bigopraticing.algorithm;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci {
    public int calculate(int inputNumber) {
        return fibonacci(inputNumber);
    }

    // O(2^n)
    private int fibonacci(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n -2);
    }
}
