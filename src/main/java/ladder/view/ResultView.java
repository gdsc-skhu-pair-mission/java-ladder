package ladder.view;

import java.util.List;

public class ResultView {

    public void startMessage() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    public void ladderHeightMessage() { System.out.println("최대 사다리 높이는 몇 개인가요?"); }

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
}
