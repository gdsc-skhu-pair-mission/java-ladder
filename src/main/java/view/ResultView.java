package view;

import java.util.List;
import model.Line;
import model.Point;

public class ResultView {

    private static final int NAME_WIDTH = 6;

    public static void printLadder(List<Line> ladder, List<String> playerNames) {
        System.out.println("실행 결과");
        printPlayerNames(playerNames);
        for (Line line : ladder) {
            printLine(line);
        }
    }

    private static void printPlayerNames(List<String> playerNames) {
        for (String playerName : playerNames) {
            System.out.printf("%-" + NAME_WIDTH + "s", playerName);
        }
        System.out.println();
    }

    private static void printLine(Line line) {
        List<Point> points = line.getPoints();
        for (Point point : points) {
            if (point.hasLine()) {
                drawLine();
            } else {
                drawEmptyLine();
            }
        }
        System.out.println("|");
    }

    private static void drawLine() {
        System.out.print("|-----");
    }

    private static void drawEmptyLine() {
        System.out.print("|     ");
    }

}
