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

    public List<Person> getNewList() {
        return newList;
    }

}
