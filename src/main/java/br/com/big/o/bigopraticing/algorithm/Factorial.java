package br.com.big.o.bigopraticing.algorithm;

import org.springframework.stereotype.Component;

@Component
public class Factorial {
    public int calculate(int inputNumber) {
        return this.factorial(inputNumber);
    }

    // O(n!)
    private int factorial(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return n * factorial(n-1);
    }
}
