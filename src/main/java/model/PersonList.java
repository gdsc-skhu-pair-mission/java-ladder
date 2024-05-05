package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.validator.PersonValidator;

public class PersonList {

    private String nameList;
    private List<Person> people = new ArrayList<>();

    public PersonList(String nameList) {
        PersonValidator.checkDuplicate(nameList);

        this.nameList = nameList;
    }

    public void personNameInput() {
        for (String personName :Arrays.asList(nameList.split(","))) {
            people.add(new Person(personName));
        }
    }

    public List<Person> getPeople(){
        return people;
    }

}
