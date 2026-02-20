package series;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Day80_1 {
    public static void main(String[] args) {

        try {
            Student s1 = new Student(101, "Shubham");

            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(s1);

            out.close();
            fileOut.close();

            System.out.println("Object Serialized Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}