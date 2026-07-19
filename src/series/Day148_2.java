package series;

import java.io.File;

public class Day148_2 {
    public static void cleanDirectory(File directory) {
        if (!directory.exists() || !directory.isDirectory()) {
            return;
        }
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    cleanDirectory(file);
                }
                file.delete();
            }
        }
    }
    public static void main(String[] args) {
        File directory = new File("TestFolder");
        cleanDirectory(directory);
        System.out.println("Directory cleaned successfully.");
    }
}