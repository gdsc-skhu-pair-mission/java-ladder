package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.FootholdGenerator;
import util.TestFootholdGenerator;

import static org.junit.jupiter.api.Assertions.*;

class LinesTest {

    @Test
    @DisplayName("addLine 메소드가 정상적으로 작동하는지 테스트 합니다.")
    void addLineTest() {
        FootholdGenerator footholdGenerator = new TestFootholdGenerator(true);

        Line line1 = new Line(footholdGenerator, 5);
        line1.makeLine();
        Line line2 = new Line(footholdGenerator, 5);
        line2.makeLine();

        Lines lines = new Lines();
        lines.addLine(line1);
        lines.addLine(line2);

        assertEquals(2, lines.getLines().size());
    }
}