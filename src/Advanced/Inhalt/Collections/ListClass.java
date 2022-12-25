package Advanced.Inhalt.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ListClass {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("10");
        linkedList.add("2");
        linkedList.add("11");
        linkedList.add("30");
        linkedList.add("11");
        linkedList.add("1");
        System.out.println("LinkedList1: " + linkedList);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Ahmad");
        list2.add("Ibrahim");
        list2.addAll(linkedList);
        list2.set(0, "Adnan");
        System.out.println("LinkedList2: " + list2);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        arrayList.add(11);
        arrayList.add(30);
        arrayList.add(11);
        arrayList.add(1);
        // 10 2 11

        // normal for
        System.out.print("Print using normal for: ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + "\t");
        }

        // enhanced for loop <--> erweiterte for schleife
        System.out.print("\nPrint using enhanced for: ");
        for (String ptr : list2) {
            System.out.print(ptr + "\t");
        }

        // Iterator
        System.out.print("\nPrint using Iterator  : ");
        Iterator<String> it = list2.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + "\t");
        }

    }
}
