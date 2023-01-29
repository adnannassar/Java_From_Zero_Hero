package Advanced.Inhalt.JavaIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReaderAndWriter {
    public static void main(String[] args) {
        // File file1 = new File("IO_Files/file1.txt");
        //  File file2 = new File("IO_Files/file2.txt");
        // copyFileUsingPrintWeiterAndFileReaderAndFileWriter(file1, file2);

        List<Student> studentList = new LinkedList<>(Arrays.asList(
                new Student("Ahmad", "Rasoul", 2.7f),
                new Student("Ahmad", "Bayram", 2.0f),
                new Student("Rwan", "Rwan", 1.7f),
                new Student("Jian", "Hesso", 1.3f)
        ));


        printStudentInfoIntoFile("Students Notes", studentList);
    }

    public static void printStudentInfoIntoFile(String fileName, List<Student> studentList) {
        try (PrintWriter printWriter = new PrintWriter("IO_Files/" + fileName + ".txt")) {
            for (Student student : studentList) {
                printWriter.println(student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void copyFileUsingFileReaderAndFileWriter(File from, File to) {
        try (FileReader fileReader = new FileReader(from);
             FileWriter fileWriter = new FileWriter(to)) {
            int a;
            while ((a = fileReader.read()) != -1) {
                fileWriter.write(a);
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void copyFileUsingBufferedFileReaderAndFileWriter(File from, File to) {
        try (FileReader fileReader = new FileReader(from);
             FileWriter fileWriter = new FileWriter(to);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)

        ) {
            int a;
            while ((a = bufferedReader.read()) != -1) {
                bufferedWriter.write(a);
            }
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void copyFileUsingReadLineOfFileReaderAndFileWriter(File from, File to) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(from));


                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(to))
        ) {
            String a;
            while ((a = bufferedReader.readLine()) != null) {
                bufferedWriter.write(a + "\r\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void copyFileUsingPrintWeiterAndFileReaderAndFileWriter(File from, File to) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(from));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(to));
                PrintWriter printWriter = new PrintWriter(bufferedWriter)
        ) {
            String a;
            while ((a = bufferedReader.readLine()) != null) {
                printWriter.println(a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Student {
    String vorname, nachname;
    float note;

    public Student(String vorname, String nachname, float note) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-10s %-20.1f", vorname, nachname + ":", note);
    }
}
