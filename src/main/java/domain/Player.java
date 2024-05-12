package domain;

public class Player {
    private final static int MAX_NAME_LENGTH = 5;

    private final String name;

    public Player(String name) {
        validateNameNull(name);
        validateNameEmpty(name);
        validateNameLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void validateNameNull(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 될 수 없습니다.");
        }
    }

    public void validateNameEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("이름은 빈 문자열이 될 수 없습니다.");
        }
    }

    public void validateNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름 길이를 초과할 수 없습니다.");
        }
    }

}
