package ExeptionsTestingLab204;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonListTest {
    @Test
    void personListTest() {
        List testList = new ArrayList();
        PersonList testListClass = new PersonList(testList);
        Person testPerson1 = new Person(1223, "Diego", 123, Occupation.Sales);
        Person testPerson2 = new Person(1253, "Karlson Waldez", 35, Occupation.Sales);
        testListClass.addToList(testPerson1);
        testListClass.addToList(testPerson2);



        assertEquals(1,testListClass.getNewList().size());

    }

}