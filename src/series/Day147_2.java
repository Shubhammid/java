package series;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day147_2 {

    public static void main(String[] args) {

        int wordCount = 0;

        try {
            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                sc.next();
                wordCount++;
            }

            sc.close();

            System.out.println("Total Words: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}