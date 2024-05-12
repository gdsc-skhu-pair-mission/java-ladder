package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LineTest {

    @Test
    @DisplayName("라인을 생성합니다.")
    void createLine() {
        List<Point> points = List.of(new Point(true), new Point(false), new Point(true));
        Line line = new Line(points);

        assertThat(line.getPoints()).isEqualTo(points);
    }

}
