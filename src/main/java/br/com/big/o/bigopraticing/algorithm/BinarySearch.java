package br.com.big.o.bigopraticing.algorithm;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    public int search(int targetNumber, int[] inputData) {
        int startIndex = 0;
        int endIndex = inputData.length -1;

        return this.binarySearching(startIndex, endIndex, targetNumber, inputData);
    }

    private int binarySearching(int start, int end, int targetNumber, int[] inputData){
        int middleIndex = (int) Math.floor((start + end)/2);
        if(inputData[middleIndex] == targetNumber){
            return middleIndex;
        }

        if(inputData[middleIndex] > targetNumber)
            return this.binarySearching(start, middleIndex -1, targetNumber, inputData);
        else
            return this.binarySearching(middleIndex +1, end, targetNumber, inputData);
    }
}
