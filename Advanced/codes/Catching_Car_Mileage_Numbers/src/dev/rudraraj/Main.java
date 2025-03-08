package dev.rudraraj;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(isInteresting(1336, new int[]{}));
    }


    public static boolean isInteresting(int number, int[] arr){
        var stream = Stream.of(
                isPalindromeNear(number, arr),
                incNearSeq(number, arr),
                decNearSeq(number, arr),
                zerosNear(number, arr),
                isPalindrome(number, arr),
                incSeq(number, arr),
                decSeq(number, arr),
                trailingZeros(number, arr),
                atPhrase(number, arr)
        )
                .
    }

    public static int nearPhrase(int number, int[] arr){
        boolean result = Arrays.stream(arr)
                .anyMatch(e -> (e - number) == 2 || (e - number) == 1);
        return result ? 1 : 0;
    }
    public static int atPhrase(int number, int[] arr){
        if(arr.length != 0){
            boolean result = Arrays.stream(arr)
                    .anyMatch(e -> (e - number) == 0);
            return result ? 2 : nearPhrase(number, arr);
        }
        return 0;
    }
    public static int withoutArr(int number){
        boolean result = IntStream.rangeClosed(number, number + 2)
                .anyMatch(e -> e == Integer.reverse(e) || );
    }

    public static 
}
