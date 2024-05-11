package model;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;
import ladder.model.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {
    @Test
    @DisplayName("사다리 가로라인(Line)을 겹치지 않게 생성하는 메소드 테스트")
    void should_ReraangeLadderLine_When_DuplicateTrue() {
        // given
        List<Boolean> points = Arrays.asList(true, true, true, true, true);

        // when
        Line line = new Line(points);

        // then
        for (int i = 0; i < points.size() - 1; i++) {
            assertFalse(points.get(i) && points.get(i + 1)); // 연속된 true가 없어야 함
        }
    }
}
