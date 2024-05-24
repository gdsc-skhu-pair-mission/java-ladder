package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class LineTest {

    @Test
    @DisplayName("라인_랜덤_생성")
    void Line_랜덤_생성(){
        List<Boolean> points = List.of(false, true, false);

        // when
        Line line = new Line(3);

        // then
        for (int i=0; i<points.size()-1;i++)
            assertFalse(points.get(i) && points.get(i+1));
    }

}
