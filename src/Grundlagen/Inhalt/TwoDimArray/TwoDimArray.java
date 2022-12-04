package Grundlagen.Inhalt.TwoDimArray;

public class TwoDimArray {

    public static void main(String[] args) {
        // nummer sind bewusst
        int[][] numbers = {{1, 2, 3, 4, 5}, {4, 5, 6, 1, 2}, {8, 9, 1, 0, 1}};

        // nummer sind nicht bewusst
        int[][] array2D = new int[5][5];
        int counter = 1 ;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                array2D[i][j] = counter++;
            }
        }

        // print 2d Array
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
