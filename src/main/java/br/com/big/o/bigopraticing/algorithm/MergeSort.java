package br.com.big.o.bigopraticing.algorithm;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MergeSort {
    public int[] sort(int[] unordenedArrayInput) {

        return mergeSort(unordenedArrayInput);
    }

    // O(n log n)
    private int[] mergeSort(int[] inputArray){
        if(inputArray.length < 2){
            return inputArray;
        }

        int middleIndex = (int) Math.floor(inputArray.length / 2);
        int[] arrayLeft = Arrays.copyOfRange(inputArray,0, middleIndex);
        int[] arrayRight = Arrays.copyOfRange(inputArray, middleIndex, inputArray.length);

        return merge(mergeSort(arrayLeft), mergeSort(arrayRight));
    }

    private int[] merge(int[] arrayLeft, int[] arrayRight){
        int resultArraySize = arrayLeft.length + arrayRight.length;
        int[] resultArray = new int[resultArraySize];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while(leftIndex < arrayLeft.length  && rightIndex < arrayRight.length){
            if(arrayLeft[leftIndex] < arrayRight[rightIndex]){
                resultArray[resultIndex++] = arrayLeft[leftIndex++];
            }else{
                resultArray[resultIndex++] = arrayRight[rightIndex++];
            }
        }

        while (leftIndex < arrayLeft.length  || rightIndex < arrayRight.length)
            resultArray[resultIndex++] = (leftIndex < rightIndex) ? arrayLeft[leftIndex++] : arrayRight[rightIndex++];

        return resultArray;
    }

}
