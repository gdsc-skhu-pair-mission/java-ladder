package ladder.view;

import java.util.List;

public class ResultView {

    private static final int MAX_NAME_DIGIT = 5;
    private static final int SPACE_REDUCTION = 2;
    private static final String ONLY_VERTICAL_LINE = "     |";
    private static final String CONTAIN_PRINT_HORIZONTAL_LINE = "-----|";

    public void startMessage() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    public void ladderHeightMessage() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public void resultMessage() {
        System.out.println("실행 결과");
    }

    public void printPeople(List<String> manipulationNames) {
        String names = "";

        for (String name : manipulationNames) {
            names += name;
        }
        String trimmedStr = names.replaceAll("^\\s+", "");

        System.out.println(trimmedStr);
    }

    public void printLine(String firstName, List<Boolean> lines) {
        StringBuilder lineBuilder = new StringBuilder();
        lineBuilder.append(firstOnlyVerticalLine(firstName));

        for (boolean elementLine : lines) {
            if (elementLine) {
                lineBuilder.append(CONTAIN_PRINT_HORIZONTAL_LINE);
            }

            if (!elementLine) {
                lineBuilder.append(ONLY_VERTICAL_LINE);
            }
        }
        System.out.println(lineBuilder);
    }

    private String firstOnlyVerticalLine(String firstName) {
        StringBuilder firstNameBuilder = new StringBuilder();

        if (firstName.length() != MAX_NAME_DIGIT) {
            for (int i = 0; i < firstName.length() - SPACE_REDUCTION; i++) {
                firstNameBuilder.append(" ");
            }
        }
        firstNameBuilder.append("|");
        return firstNameBuilder.toString();
    }
}
