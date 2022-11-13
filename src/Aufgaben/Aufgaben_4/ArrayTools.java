package Aufgaben.Aufgaben_4;

public class ArrayTools {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        int[] array = new int[array1.length + array2.length];


        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int j = array1.length; j < array.length; j++) {
            array[j] = array2[j - array1.length];

        }
        for (int r = 0; r < array.length; r++) {

            System.out.print(array[r] + " ");
        }
        System.out.println();

        bubbleSort(array);
        System.out.println("Ergebnis");
        printArray(array);
        printArray(merge(array1, array2));



    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > i + 1) {
                    swap(array, i + 1, i);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int tempo = array[i];
        array[i] = array[j];
        array[j] = tempo;
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] a, int[] b) {
        int[] erg = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        for(int x = 0; x < erg.length; x ++){
            while (a[i] < b[j]) {
                erg[k] = a[i];
                i++;
                k++;
            }
            while (b[j] < a[i]) {
                erg[k] = b[j];
                j++;
                k++;
            }
        }

        return erg;
    }

}
