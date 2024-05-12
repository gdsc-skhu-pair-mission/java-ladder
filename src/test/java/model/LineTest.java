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
        Line line = new Line(generator);
        Players players = new Players(Arrays.asList("a", "bb", "ccc", "dddd"));

        line.makeLine(players);

        assertEquals("     |     |     |     |", line.getLine().toString());
    }

    @Test
    void makeLineWithFoothold() {
        TestFootholdGenerator generator = new TestFootholdGenerator(true);
        Line line = new Line(generator);
        Players players = new Players(Arrays.asList("a", "bb", "ccc", "dddd"));

        line.makeLine(players);

        assertEquals("     |-----|     |-----|", line.getLine().toString());
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
