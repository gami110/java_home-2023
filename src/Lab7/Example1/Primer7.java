package Lab7.Example1;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Primer7 {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);
        try {
            FileOutputStream fileOut = new FileOutputStream("src/Lab7/Example1/person.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
