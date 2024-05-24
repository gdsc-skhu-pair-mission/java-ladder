package domain;


import domain.exception.HumanNameException;

public class Human {
    private String name;

    public Human(final String name) {

        if (name.length() > 5) {
            throw new HumanNameException("사람 이름은 5글자 이내로 작성해주세요.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
