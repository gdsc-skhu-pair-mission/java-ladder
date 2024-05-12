package view;

import java.util.List;
import model.Line;
import model.Point;

public class ResultView {

    public static void printLadder(List<Line> ladder, List<String> playerNames) {
        System.out.println("실행 결과");
        printPlayerName(playerNames);
        for (Line line : ladder) {
            printLine(line);
        }
    }

    private static void printPlayerName(List<String> playerNames) {
        for (String playerName : playerNames) {
            System.out.printf("%6s", playerName);
        }
        System.out.println();
    }

    private static void printLine(Line line) {
        List<Point> points = line.getPoints();
        for (Point point : points) {
            System.out.print(point.hasLine() ? "|-----" : "|     ");
        }
        System.out.println("|");
    }

}
