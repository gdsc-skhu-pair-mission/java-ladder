package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.FootholdGenerator;
import util.RandomFootholdGenerator;
import util.TestFootholdGenerator;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class LineTest {
    private Line line;
    private Players players;
    private Height height;

    @Test
    void makeLineWithNotFoothold() {
        TestFootholdGenerator generator = new TestFootholdGenerator(false);

        int size = 5;
        Line line = new Line(generator, size);

        line.makeLine();

        boolean[] result = new boolean[size];
        assertArrayEquals(result, line.getLine());
    }

    @Test
    @DisplayName("Foothold가 있는 라인 생성 테스트")
    void makeLineWithFoothold() {
        TestFootholdGenerator generator = new TestFootholdGenerator(true);
        int size = 5;
        Line line = new Line(generator, size);

        line.makeLine();

        boolean[] result = new boolean[size];
        for (int i = 0; i < size; i++) {
            result[i] = true;
        }

        assertArrayEquals(result, line.getLine());
    }

    @Test
    @DisplayName("정상적으로 라인 객체 생성")
    void Line_Object_Create_Success_Test() {

        // given
        line = new Line(new RandomFootholdGenerator());
        players = new Players(Arrays.asList("a", "bb", "ccc", "dddd", "eeeee"));
        height = new Height("5");

        // when
        line.makeLine(players);

        // then
        assertThat(line).isNotNull();
    }
}
