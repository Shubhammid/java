package series;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day148_1 {

    public static void main(String[] args) {
        String filePath = "sample.txt";

        try {
            String content = Files.readString(Path.of(filePath));

            String reversed = new StringBuilder(content).reverse().toString();

            Files.writeString(Path.of(filePath), reversed);

            System.out.println("File content reversed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}