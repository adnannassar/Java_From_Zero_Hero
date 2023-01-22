package Advanced.Inhalt.JavaIO;

import java.io.*;

public class BufferStreams {

    public static void main(String[] args) {
        File file1 = new File("IO_Files/file1.txt");
        System.out.println(file1.getName());
        readUsingBufferedInputStream(file1);

        File file2 = new File("IO_Files/file2.txt");
        writeUsingBufferedOutputStream(file2);

        copyUsingBufferedInputAndOutputStreams(file1);
    }

    public static void readUsingBufferedInputStream(File file) {
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)
        ) {
            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(file.getName() + " does not exist!");
        }
    }

    public static void writeUsingBufferedOutputStream(File file) {
        try (FileOutputStream fos = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            String message = "Welcome Ahmad in our Java course";
            char[] messageArray = message.toCharArray();
            byte[] messageByteArray = new byte[messageArray.length];
            for (int i = 0; i < messageArray.length; i++) {
                messageByteArray[i] = (byte) messageArray[i];
            }
            bos.write(messageByteArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyUsingBufferedInputAndOutputStreams(File from) {
        File to = new File("IO_Files/" + from.getName().substring(0, from.getName().length() - 4) + " copy.txt");
        System.out.println(to.getName());
        try (FileInputStream fis = new FileInputStream(from);
             FileOutputStream fos = new FileOutputStream(to);
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            int c;
            while ((c = bis.read()) != -1) {
                bos.write(c);
            }

        } catch (IOException e) {
            System.out.println(from.getName() + " does not exist!");
        }
    }
}

