package dev.rudraraj;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText, bText, cText, dText, eText);

        Set<String> mySet = new HashSet<>(hellos);
        // A HashSet in Java is a collection that stores unique elements and provides fast access to them.
        // It is part of the java.util package and uses a hash table internally to store elements.

        System.out.println("mySet = " + mySet);
        System.out.println("Size of the set is " + mySet.size());
        // you may wonder why does the set have two values instead of four ?
        // Java stores string in a different way.
        // even though Hello is in two different variable, it doesn't allocate a different memory to both of them. As both have the same values the variable bText is referenced to the memory location of variable aText.
        // Note that .join allocates a new memory despite the same value
        // also that HashSet uses a hash table to store its value the same value be hashed to the same hashed code and hence it knows which values are redundant.

        // checking which variable is same
        for (String setValue: mySet){
            System.out.print(setValue + ": ");
            for (int i = 0; i < hellos.size(); i++) {
                if(setValue == hellos.get(i)){
                    System.out.print(i + ", "); // 0,1,4 represent the index
                }
            }
            System.out.println();
        }
    }
}
