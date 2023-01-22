package Advanced.Inhalt.JavaIO;

import java.io.*;

public class FileStreams {
    public static void main(String[] args) {
        File file1 = new File("IO_Files/file1.txt");
        System.out.println(file1.getName());
        readUsingFileInputStream(file1);

        File file2 = new File("IO_Files/file2.txt");
        writeUsingFileOutputStream(file2);


        copyUsingFileInputAndOutputStreams(file1);

    }

    public static void readUsingFileInputStream(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(file.getName() + " does not exist!");
        }
    }

    public static void writeUsingFileOutputStream(File file) {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            String message = "Welcome Ahmad in our Java course";
            char[] messageArray = message.toCharArray();
            byte[] messageByteArray = new byte[messageArray.length];
            for (int i = 0; i < messageArray.length; i++) {
                messageByteArray[i] = (byte) messageArray[i];
            }
            fos.write(messageByteArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyUsingFileInputAndOutputStreams(File from) {
        File to = new File("IO_Files/" + from.getName().substring(0,from.getName().length() - 4) + " copy.txt");
        System.out.println(to.getName());
        try (FileInputStream fis = new FileInputStream(from);
             FileOutputStream fos = new FileOutputStream(to)) {
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }

        } catch (IOException e) {
            System.out.println(from.getName() + " does not exist!");
        }
    }
}
