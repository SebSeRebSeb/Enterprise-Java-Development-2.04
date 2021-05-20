package ExeptionsTestingLab204;

import java.util.List;

public class PersonList {
    private List <Person> newList;

    public PersonList(List<Person> newList) {
        this.newList = newList;
    }

    public void addToList(Person a){
        if (a.getName().split(" ").length >1 ){
            newList.add(a);
        }else{
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Bitte Namen korrekt erfassen");
            }
        }
    }
    public Person findPerson(String name) throws Exception {
        Person ret1= new Person();
        for (Person person: newList){
            if (person.getName().equals(name)){
                ret1 = person;
                return ret1;
            }else{
                System.out.println("Person existiert nicht in der Personliste");
            }
        }       throw new Exception("No Person with given Name in List");
    }

    public List<Person> getNewList() {
        return newList;
    }

}
