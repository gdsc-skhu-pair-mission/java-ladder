package model;

public class Player {
    private static final int MAXIMUM_ALLOWED_LENGTH = 5;

    private final String name;

    protected Player(String name) {
        checkNameIsNotNull(name);
        checkNameIsNotEmpty(name);
        checkNameLength(name);
        checkNameIsNotNumber(name);
        checkNameIsNotKorean(name);
        checkNameIsNotSpecialCharacter(name);
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    private void checkNameIsNotNull(String name) {
        if (name == null) {
            throw new IllegalArgumentException("참여자 이름은 null일 수 없습니다.");
        }
    }

    private void checkNameIsNotEmpty(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("참여자 이름은 빈 문자열일 수 없습니다.");
        }
    }

    private void checkNameLength(String name) {
        if (name.length() > MAXIMUM_ALLOWED_LENGTH) {
            throw new IllegalArgumentException("참여자 이름은 5글자를 넘을 수 없습니다.");
        }
    }

    private void checkNameIsNotNumber(String name) {
        if (name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("참여자 이름에 숫자가 포함될 수 없습니다.");
        }
    }

    private void checkNameIsNotKorean(String name) {
        if (name.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣].*")) {
            throw new IllegalArgumentException("참여자 이름에 한글이 포함될 수 없습니다.");
        }
    }

    private void checkNameIsNotSpecialCharacter(String name) {
        if (name.matches(".*[!@#$%^&*()].*")) {
            throw new IllegalArgumentException("참여자 이름에 특수문자가 포함될 수 없습니다.");
        }
    }
}
