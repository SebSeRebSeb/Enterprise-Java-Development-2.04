package ExeptionsTestingLab204;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person steve = new Person(0011, "Steve Smith", 12, Occupation.Worker);
        Person steve1 = new Person(0011, "Steve Sam", 10, Occupation.Sales);
        Person steve2 = new Person(0011, "Steve Karl", 50, Occupation.Driver);
        Person steve3 = new Person(0011, "StevenSmith", 55, Occupation.Doctor);

        List personList = new ArrayList();

        PersonList list1 = new PersonList(personList);

        System.out.println(steve.getOccupation().getSalary());
        System.out.println(steve.getAge());

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
