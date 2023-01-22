package Advanced.Inhalt.JavaIO;

import java.io.File;
import java.io.FileFilter;

public class FilterClass {
    public static void main(String[] args) {
        File folder = new File("IO_Files");
        File[] filesNames = folder.listFiles(new ImageFilter());
        for (int i = 0; i < filesNames.length; i++) {
            System.out.println(filesNames[i].getName());
        }

        System.out.println("\nReading as Category:");
        readCategory(folder);
    }

    private static void readCategory(File folder) {
        File[] fileNames = folder.listFiles();
        boolean hasFolder = false;
        for (int i = 0; i < fileNames.length; i++) {
            if (fileNames[i].isDirectory()) {
                hasFolder = true;
            }
        }
        if(hasFolder){
            System.out.println("Folders:");
            for (int i = 0; i < fileNames.length; i++) {
                if (fileNames[i].isDirectory()) {
                    System.out.println("\t" + fileNames[i].getName());
                }
            }
        }

        File[] imagesNames = folder.listFiles(new ImageFilter());
        if (imagesNames.length != 0) {
            System.out.println("Images:");
            for (int i = 0; i < imagesNames.length; i++) {
                System.out.println("\t" + imagesNames[i].getName());
            }
        }

        File[] pdfsNames = folder.listFiles(new PdfFilter());
        if (pdfsNames.length != 0) {
            System.out.println("PDFs:");
            for (int i = 0; i < pdfsNames.length; i++) {
                System.out.println("\t" + pdfsNames[i].getName());
            }
        }

        File[] textNames = folder.listFiles(new TextFilter());
        if (textNames.length != 0) {
            System.out.println("Texts:");
            for (int i = 0; i < textNames.length; i++) {
                System.out.println("\t" + textNames[i].getName());
            }
        }


    }

}

class PdfFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        return file.toString().toLowerCase().endsWith(".pdf");
    }
}

class ImageFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        return file.toString().toLowerCase().endsWith(".jpeg") ||
                file.toString().toLowerCase().endsWith(".png") ||
                file.toString().toLowerCase().endsWith(".gif") ||
                file.toString().toLowerCase().endsWith(".raw") ||
                file.toString().toLowerCase().endsWith(".svg");
    }
}

class TextFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        return file.toString().toLowerCase().endsWith(".txt");
    }
}






