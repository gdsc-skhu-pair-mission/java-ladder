package view;

import java.util.List;

public class OutputView {
    public static final String INPUT_HUMAN_NAME = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    public static final String INPUT_LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
    private static final String COLUMN = "|";
    private static final String BRIDGE = "-----";
    private static final String SPACE = " ";
    private static final String FIRST_SPACE ="    ";

    public void printNames(){
        System.out.println(INPUT_HUMAN_NAME);
    }

    public void printHeight(){
        System.out.println(INPUT_LADDER_HEIGHT);
    }

    public void printNames(String[] names){
        for (String name : names) {
            System.out.print(name + SPACE);
        }
       // System.out.println();
    }

    public void printLadder(List<List<Boolean>> lines){
        for (List<Boolean> line : lines) {
            System.out.print(FIRST_SPACE);
            System.out.print(COLUMN);
            for (Boolean point : line) {
                System.out.print(point ? BRIDGE + COLUMN : SPACE.repeat(BRIDGE.length()) + COLUMN);
            }
            System.out.println();
        }
    }
}
