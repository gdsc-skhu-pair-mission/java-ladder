package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PointTest {

    @Test
    @DisplayName("포인트 생성 : 선이 있는 경우")
    void createPointWithLine() {
        Point point = new Point(true);
        assertTrue(point.hasLine());
    }

    @Test
    @DisplayName("포인트 생성 : 선이 없는 경우")
    void createPointWithoutLine() {
        Point point = new Point(false);
        assertFalse(point.hasLine());
    }

}
