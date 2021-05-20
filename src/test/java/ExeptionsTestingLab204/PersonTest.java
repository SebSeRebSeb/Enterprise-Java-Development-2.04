package ExeptionsTestingLab204;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person Test1 = new Person(12, "Frank Sinatra", 120, Occupation.Doctor);

    Person Test2 = new Person(15, "Frank Santa", -12, Occupation.Sales);


    @Test
    void doCheckTest() {


        assertEquals(120, Test1.getAge());
        assertEquals(1, Test2.getAge());
    }

    @Test
    void doCloneCheck() {
        Person cloneTest1 = Test1.clone();
        assertEquals(13, cloneTest1.getId());
        assertEquals(120, cloneTest1.getAge());

    }

    @Test
    void checkSalary(){
        assertEquals(Occupation.Doctor, Test1.getOccupation());
    }


}