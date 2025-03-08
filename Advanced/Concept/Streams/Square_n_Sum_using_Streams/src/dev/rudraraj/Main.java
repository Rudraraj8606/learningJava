package dev.rudraraj;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int arrSum = squareN(array);
        System.out.println(arrSum);
    }

    public static int squareN(int[] arr){
        return Arrays.stream(arr)
                .map(i -> i * i)
                .sum();
    }
}
