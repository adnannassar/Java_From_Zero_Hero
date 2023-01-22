package Advanced.Inhalt.JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileClass {

    public static void main(String[] args) {
        File file = new File("IO_Files/file1.txt");

        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        System.out.println("Reading inhalt of folder IO_Files...");
        File folder = new File("IO_Files");
        String[] filesNames = folder.list();
        for (int i = 0; i < filesNames.length; i++) {
            System.out.println(filesNames[i]);
        }
    }
}
