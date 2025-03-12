package dev.rudraraj;

import java.util.Arrays;

public class Palindrome {
    private int number;
    private final int[] arr;

    public Palindrome(int number, int[] arr) {
        this.arr = arr;
        this.number = number;
    }

    public int checkPalin(){
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
            int reversed = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
            boolean result = number == reversed;
            if((result && count == 0) || (arrResult && count == 0)){
                return 2;
            } else if ((result && count == 1 || result && count == 2) || (arrResult && count == 1 || arrResult && count == 2)) {
                System.out.println("called palin");
                return 1;
            } else {
                count++;
                this.number+=1;
            }
        }
        return 0;


    }
}

