package series;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Day80_2 {
    public static void main(String[] args) {

        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student s = (Student) in.readObject();

            in.close();
            fileIn.close();

            System.out.println("Object Deserialized Successfully");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}