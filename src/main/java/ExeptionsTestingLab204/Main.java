package ExeptionsTestingLab204;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person steve = new Person(0011, "Steve Smith", 12, "Worker");
        Person steve1 = new Person(0011, "Steve Sam", 10, "Worker");
        Person steve2 = new Person(0011, "Steve Karl", 50, "Worker");
        Person steve3 = new Person(0011, "StevenSmith", 55, "Worker");

        List personList = new ArrayList();

        PersonList list1 = new PersonList(personList);

        list1.addToList(steve);
        System.out.println(personList.size());
        list1.addToList(steve3);
        System.out.println(personList.size());
        writeFile(steve);
    }

    public static void writeFile(Person a) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("Person Info.txt");
            writer.write("Persons Name is: " + a.getName() + "\n" + "Persons java Code is: " + a.toString() + "\n" + "Person age is: " + a.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Jetzt hast dus komplett verbockt");
            }
        }
    }
}
