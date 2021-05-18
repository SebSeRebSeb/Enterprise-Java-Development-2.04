package ExeptionsTestingLab204;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        try {
            setAge(age);
        } catch (Exception e) {
            this.age = 1;
        }
        this.occupation = occupation;
    }

    public void setAge(int age) throws Exception {
        if (age <= 0) {
            throw new Exception("So Jung geht nicht");
        } else {
            this.age = age;
        }
    }

    public Person clone() {
        int newId = this.id + 1;
        Person clone = new Person(newId, this.name, this.age, this.occupation);
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(occupation, person.occupation);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getOccupation() {
        return occupation;
    }
}
