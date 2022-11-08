package Inhalt.Algorithmen;

public class SortAlgorithmen {

    public static void main(String[] args) {
        int array[] = {1, 6, 200, -1, 100, 3, 2, 10, 0};
        System.out.print("Before: ");
        printArray(array);

        bubbleSort(array);
        System.out.print("After:  ");
        printArray(array);
    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    swap(array, j + 1, j);
                }
            }
        }
    }

    static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
