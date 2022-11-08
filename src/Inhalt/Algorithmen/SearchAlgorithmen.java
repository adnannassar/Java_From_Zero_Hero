package Inhalt.Algorithmen;

public class SearchAlgorithmen {

    public static void main(String[] args) {
        String array[] = {"Ali", "Saif", "Mousafa", "yhaha", "Rwan"};
        System.out.println(searchWord(array, "Rwan"));



    }

    public static boolean searchWord(String[] array, String word) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(word)){
                return true;
            }
        }
        return false;
    }

    public static boolean searchNumber(int[] array, int nr) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] ==  nr){
                return true;
            }
        }
        return false;
    }


}
