package view;

import java.util.List;

public class OutputView {
    private static final String HORIZON_DELIMITER = "-----";
    private static final String VERTICAL_DELIMITER = "|";
    private static final String SPACE = "     ";

    private static final StringBuilder output = new StringBuilder();

    public static void printResult(List<String> names, List<List<Boolean>> ladderInformation) {
        output.append("사다리 결과\n\n");
        printPlayers(names);
        printLadder(ladderInformation);

        System.out.print(output);
    }

    private static void printPlayers(List<String> names) {
        names.forEach(name -> output.append(String.format("%6s", name)));
        output.append("\n");
    }

    private static void printLadder(List<List<Boolean>> ladderInformation) {
        for (List<Boolean> lineInformation : ladderInformation) {
            printLine(lineInformation);
        }
    }

    private static void printLine(List<Boolean> line) {
        output.append(SPACE);
        output.append(VERTICAL_DELIMITER);
        for (boolean isHorizon : line) {
            printBridge(isHorizon);
        }
        output.append("\n");
    }

    private static void printBridge(boolean isHorizon) {
        if (isHorizon) {
            output.append(HORIZON_DELIMITER);
            output.append(VERTICAL_DELIMITER);
            return;
        }
        output.append(SPACE);
        output.append(VERTICAL_DELIMITER);
    }
}
