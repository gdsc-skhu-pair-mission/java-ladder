package util;

import model.Line;
import model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LineGenerator {

    private static boolean previous = false;
    private static Random random = new Random();

    public static Line generateLine(int numberOfPlayers) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers - 1; i++) {
            boolean next = random.nextBoolean() && !previous;
            points.add(new Point(next));
            previous = next;
        }
        return new Line(points);
    }

    public static List<Point> createPointsForLine(int numberOfPoints) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < numberOfPoints; i++) {
            boolean current = random.nextDouble() > 0.5 && !previous;
            points.add(new Point(current));
            previous = current;
        }
        return points;
    }

    public static boolean hasSerialTrue(List<Point> points) {
        for (int i = 0; i < points.size() - 1; i++) {
            if (points.get(i).hasLine() && points.get(i + 1).hasLine()) {
                return true;
            }
        }
        return false;
    }

}
