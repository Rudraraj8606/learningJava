package dev.rudraraj;

import java.util.stream.IntStream;

public class RowSumOddNumbers {
    final int rowNumber;

    public RowSumOddNumbers(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getEndLimit(){
        // formula = x^2 + x - 1
        int limit = ((rowNumber * rowNumber) + (rowNumber) - 1)  + 1;
        return limit;
    }

    public int getStartLimit(){
        // formula = x^2 - x + 1
        int limit = ((rowNumber * rowNumber) - (rowNumber) + 1) ;
        return limit;
    }

    public int sumRow(){
        return IntStream.rangeClosed(getStartLimit(), getEndLimit())
                .filter(i -> i % 2 != 0)
                .sum();
    }
}
