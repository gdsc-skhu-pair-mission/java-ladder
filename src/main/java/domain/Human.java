package domain;


public class Human {
    private String name;

    public Human(final String name) {
        this.name = name;
        if (name.length() > 5){throw new IllegalArgumentException("사람 이름은 5글자 이내로 작성해주세요.");}
    }

    public String getName() {
        return name;
    }
}
