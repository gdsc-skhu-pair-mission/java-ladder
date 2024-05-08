package model;

import ladder.model.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.List;

class LineTest {
    @Test
    @DisplayName("사다리 가로라인(Line)을 겹치지 않게 생성하는 메소드 테스트")
    void should_ReraangeLadderLine_When_DuplicateTrue() {
        // given
        Line line = new Line(6); // 사람 수를 6로 설정, 한 행에 세로 선이 얼마나 있는지
        List<Boolean> points = Arrays.asList(true, true, true, true, true);

        // when
        line.rearrange(points);

        // then
        for (int i = 0; i < points.size() - 1; i++) {
            assertFalse(points.get(i) && points.get(i + 1)); // 연속된 true가 없어야 함
        }
    }
}
