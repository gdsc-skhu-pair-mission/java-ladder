package model;

import util.validator.PersonValidator;

public class Person {

    private String name;

    public Person(String name) {
        PersonValidator.checkEmpty(name);
        PersonValidator.checkOverRange(name);
        PersonValidator.checkSpace(name);

        this.name = name;
    }

    public String getName() {
        return name;
    }

}
