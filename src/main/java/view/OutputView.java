package view;

public class OutputView {
    public static final String INPUT_HUMAN_NAME = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    public static final String INPUT_LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
    private static final String COLUMN = "|";
    private static final String BRIDGE = "-----";

    public void printNames(){
        System.out.println(INPUT_HUMAN_NAME);
    }

    public void printHeight(){
        System.out.println(INPUT_LADDER_HEIGHT);
    }

}
