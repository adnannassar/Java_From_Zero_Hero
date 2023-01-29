package Advanced.Inhalt.JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyRandomAccessFile {
    public static void main(String[] args) {
        File from = new File("IO_Files/file1.txt");
        File to = new File("IO_Files/file2.txt");
        copyWithRandomAccessFile(from, to);
    }

    public static void copyWithRandomAccessFile(File from, File to) {
        if (from.isFile() && to.isFile()) {
            try (RandomAccessFile in = new RandomAccessFile(from, "r");
                 RandomAccessFile out = new RandomAccessFile(from, "rw");) {
                in.seek(0);
                out.seek(out.length());
                for (int i = 0; i < from.length(); i++) {
                    out.write(in.read());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
