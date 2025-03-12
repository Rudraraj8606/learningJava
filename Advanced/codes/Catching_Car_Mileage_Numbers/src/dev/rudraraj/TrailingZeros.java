package dev.rudraraj;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TrailingZeros {
    private int number;
    private final int[] arr;

    public TrailingZeros(int number, int[] arr) {
        this.arr = arr;
        this.number = number;
    }

    public int checkTrailingZero(){
        if (!(number > 97 && number < 1000000000)){
            return 0;
        }
        int count = 0;
        while(count < 3){
            if(this.number <= 99){
                this.number++;
                count++;
            }
            AwesomePhrase preResult = (int number, int[] arr) -> Arrays.stream(arr).anyMatch(e-> e - number == 0);
            boolean arrResult = preResult.CheckFromArray(number, arr);
            int[] digits = String.valueOf(this.number).chars().map(c -> c - '0').toArray();
            boolean result = IntStream.rangeClosed(1, digits.length - 1)
                    .allMatch(i -> digits[i]  == 0);
            if((result && count == 0) || (arrResult && count == 0)){
                return 2;
            }else if ((result && count == 1 || result && count == 2) || (arrResult && count == 1 || arrResult && count == 2)) {
                System.out.println("called trailing");
                return 1;
            }
            else{
                count++;
                this.number += 1;
            }
        }
        return 0;
    }
}