package util;

import model.Line;
import model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineGeneratorTest {

    @Test
    @DisplayName("라인을 생성합니다.")
    void generateLine() {
        Line line = LineGenerator.generateLine(5);

        assertNotNull(line);
        assertEquals(4, line.getPoints().size());
    }

    @Test
    @DisplayName("라인에 포인트를 생성합니다.")
    void createPointsForLine() {
        List<Point> points = LineGenerator.createPointsForLine(5);

        assertNotNull(points);
        assertEquals(5, points.size());
    }

    @Test
    @DisplayName("연속되는 선이 있는 경우 true를 반환합니다.")
    void hasSerialTrue() {
        List<Point> points = Arrays.asList(
                new Point(true),
                new Point(false),
                new Point(true),
                new Point(true),
                new Point(false)
        );

        assertTrue(LineGenerator.hasSerialTrue(points));
    }

    @Test
    @DisplayName("연속되는 선이 없는 경우 false를 반환합니다.")
    void hasSerialFalse() {
        List<Point> points = Arrays.asList(
                new Point(true),
                new Point(false),
                new Point(true),
                new Point(false),
                new Point(false)
        );

        assertFalse(LineGenerator.hasSerialTrue(points));
    }

}
