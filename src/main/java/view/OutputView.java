package view;

import java.util.List;

public class OutputView {
    private static final String HORIZON_DELIMITER = "-----";
    private static final String VERTICAL_DELIMITER = "|";
    private static final String SPACE = "     ";

    public static void printResult(List<String> names, List<List<Boolean>> ladderShape) {
        StringBuilder outputBuffer = new StringBuilder();

        outputBuffer.append("사다리 결과\n\n");
        printPlayers(names, outputBuffer);
        printLadder(ladderShape, outputBuffer);

        System.out.print(outputBuffer);
    }

    private static void printPlayers(List<String> names, StringBuilder outputBuffer) {
        names.forEach(name -> outputBuffer.append(String.format("%6s", name)));
        outputBuffer.append("\n");
    }

    private static void printLadder(List<List<Boolean>> ladderShape, StringBuilder outputBuffer) {
        for (List<Boolean> lineShape : ladderShape) {
            printLine(lineShape, outputBuffer);
        }
    }

    private static void printLine(List<Boolean> lineShape, StringBuilder outputBuffer) {
        outputBuffer.append(SPACE);
        outputBuffer.append(VERTICAL_DELIMITER);
        for (boolean isExist : lineShape) {
            printBridge(isExist, outputBuffer);
        }
        outputBuffer.append("\n");
    }

    private static void printBridge(boolean isExist, StringBuilder outputBuffer) {
        if (isExist) {
            outputBuffer.append(HORIZON_DELIMITER);
            outputBuffer.append(VERTICAL_DELIMITER);
            return;
        }
        outputBuffer.append(SPACE);
        outputBuffer.append(VERTICAL_DELIMITER);
    }
}
