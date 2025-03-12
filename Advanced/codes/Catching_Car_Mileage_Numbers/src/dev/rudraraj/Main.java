package dev.rudraraj;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
         Integer stream1 = Stream.of(
                new TrailingZeros(1590, new int[]{1331, 256}).checkTrailingZero(),
                new Sequence(1590, new int[]{1331, 256}).Decrementing(),
                new Sequence(1590, new int[]{1331, 256}).Incrementing(),
                new Palindrome(1590, new int[]{1331, 256}).checkPalin()
                )
                .filter(e -> e == 0 || e == 1 || e == 2)
                .max(Integer::compare).get();

        System.out.println(stream1);
    }

}
