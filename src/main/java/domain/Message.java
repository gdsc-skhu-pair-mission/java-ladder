package domain;

public enum Message {
    INPUT_HUMAN_NAME("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)"),
    INPUT_LADDER_HEIGHT(" 최대 사다리 높이는 몇 개인가요?"),
    COLUMN("|"),
    BRIDGE("-----"),
    SPACE(" "),
    FIRST_SPACE("    ");

    private final String message;

    Message(String message){
        this.message=message;
    }

    @Override
    public String toString() {
        return message;
    }

}
