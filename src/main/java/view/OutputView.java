package view;

import java.util.List;

public class OutputView {

    public void printResultSentence(List<List<Boolean>> lines, List<String> playerNames) {
        System.out.println("실행결과");
        printPlayerNames(playerNames);
        printLadder(lines);
    }

    private void printPlayerNames(List<String> playerNames) {
        playerNames.forEach(name -> System.out.printf("%-6s", name));
        System.out.println();
    }

    private void printLadder(List<List<Boolean>> lines) {
        lines.forEach(line -> {
            printLine(line);
            System.out.println("|");
        });
    }

    private void printLine(List<Boolean> line) {
        for (int i = 0; i < line.size(); i++) {
            System.out.print("|");
            printFoothold(line, i);
        }
    }

    private void printFoothold(List<Boolean> line, int index) {
        if (index < line.size() && line.get(index)) {
            System.out.print("-----");
            return;
        }

        System.out.print("     ");
    }
}
