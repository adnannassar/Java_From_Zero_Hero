package Advanced.Inhalt.Collections;

import Grundlagen.Inhalt.Algorithmen.SortAlgorithmen;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet();
        set.add(10);
        set.add(2);
        set.add(11);
        set.add(30);
        set.add(11);
        set.add(1);
        System.out.println("Set: " + set);


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(2);
        linkedHashSet.add(11);
        linkedHashSet.add(30);
        linkedHashSet.add(11);
        linkedHashSet.add(1);
        System.out.println("LinkedHashSet: " + linkedHashSet);


        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(2);
        tree.add(11);
        tree.add(30);
        tree.add(11);
        tree.add(1);
        System.out.println("TreeSet: " + tree);

    }
}

