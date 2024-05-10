package view;

import java.util.List;

public class OutputView {
    private static final String HORIZON_DELIMITER = "-----";
    private static final String VERTICAL_DELIMITER = "|";
    private static final String SPACE = "     ";

    public static void printResult(List<String> names, List<List<Boolean>> ladderInformation) {
        System.out.println("사다리 결과");
        System.out.println();
        printPlayers(names);
        printLadder(ladderInformation);
    }

    private static void printPlayers(List<String> names) {
        names.forEach(name -> System.out.printf("%6s", name));
        System.out.println();
    }

    private static void printLadder(List<List<Boolean>> ladderInformation) {
        for (List<Boolean> lineInformation : ladderInformation) {
            printLine(lineInformation);
        }
    }

    private static void printLine(List<Boolean> lineInformation) {
        System.out.print(SPACE);
        System.out.print(VERTICAL_DELIMITER);
        for (boolean isHorizon : lineInformation) {
            printBridge(isHorizon);
        }
        System.out.println();
    }

    private static void printBridge(boolean isHorizon) {
        if (isHorizon) {
            System.out.print(HORIZON_DELIMITER);
            System.out.print(VERTICAL_DELIMITER);
            return;
        }
        System.out.print(SPACE);
        System.out.print(VERTICAL_DELIMITER);
    }
}
