package Grundlagen.Polymorphie;

import java.util.*;

public class Polymorphie {
    static long N = 1000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        Collections.shuffle(list);


        System.out.println("Time for linked ListClass: " + checkContainsTime(new LinkedList<>(list)));
        System.out.println("Time for array ListClass: " + checkContainsTime(list));
        System.out.println("Time for hashset ListClass: " + checkContainsTime(new LinkedHashSet<>(list)));
        System.out.println("Time for tree ListClass: " + checkContainsTime(new TreeSet<>(list)));
    }

    public static long checkContainsTime(Collection<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.contains((int) (Math.random() * N));
        }
        return System.currentTimeMillis() - startTime;
    }



}

