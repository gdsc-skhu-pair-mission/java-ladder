package model;

import util.validator.PersonValidator;

public class Person {

    public Person(String name) {
        PersonValidator.checkEmpty(name);
        PersonValidator.checkOverRange(name);
        PersonValidator.checkDuplicate(name);
        PersonValidator.checkSpace(name);
    }
}
