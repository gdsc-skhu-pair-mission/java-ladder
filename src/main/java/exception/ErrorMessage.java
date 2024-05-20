package exception;

public enum ErrorMessage {

    DUPLICATED_CAR_NAME("참여자 이름이 중복될 수 없습니다."),
    NOT_ALLOW_BLANK("참여자 이름에 공백이 들어갈 수 없습니다."),
    NOT_ALLOW_EMPTY("참여자 입력 값이 비어있을수 없습니다."),
    INVALID_NAME_LENGTH("참여자의 이름은 5자 이하여야합니다."),
    NOT_NUMERIC("시도 횟수 입력은 숫자여야 합니다."),
    ONLY_NATURAL_NUMBER("시도 횟수는 자연수여야합니다"),
    NOT_ALLOW_ZERO("사다리 높이는 0이 될 수 없습니다");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
