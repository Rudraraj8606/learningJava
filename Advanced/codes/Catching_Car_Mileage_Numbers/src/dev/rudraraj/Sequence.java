package dev.rudraraj;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Sequence {
    private int number;
    private int[] arr;

    public Sequence(int number, int[] arr) {
        this.number = number;
        this.arr = arr;
    }

    public int Incrementing(){
        if (!(number > 97 && number < 1000000000)){
            return 0;
        }
        int count = 0;
        int countErrors = 0;
        while(count < 3){
            if(this.number <= 99){
                this.number++;
            }
            String str = String.valueOf(this.number);
            int len = str.length();
            AwesomePhrase preResult = (int number, int[] arr) -> Arrays.stream(arr).anyMatch(e-> e - number == 0);
            boolean arrResult = preResult.CheckFromArray(number, arr);
            for (int i = 0; i < len - 1; i++) {
                int current = str.charAt(i) - '0';
                int next = str.charAt(i + 1) - '0';

                if (next != current + 1) {
                    if (!(current == 9 && next == 0 && i == len - 2 && str.charAt(i - 1) - '0' == 8)) { // Special case: 9 to 0 is valid
                        countErrors++;
                        count++;
                    }
                }
            }
            if((countErrors == 0 && count == 0) || (arrResult && count == 0)){
                return 2;
            }else if ((countErrors == 1 && count == 1 || countErrors == 2 && count == 2) || (arrResult && count == 1 || arrResult && count == 2)) {
                return 1;
            }
            else{
                count++;
                this.number += 1;
            }
        }
        System.out.println(countErrors);
        System.out.println(count);
        return 0;
    }

    public int Decrementing(){
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
            boolean result = IntStream.rangeClosed(0, digits.length - 2)
                    .allMatch(i -> digits[i] - digits[i + 1] == 1);
            if((result && count == 0) || (arrResult && count == 0)){
                return 2;
            }else if ((result && count == 1 || result && count == 2) || (arrResult && count == 1 || arrResult && count == 2)){
                System.out.println("called dec");
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

