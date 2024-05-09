package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    private Line line;
    private Players players;
    private Height height;

    @Test
    @DisplayName("정상적으로 라인 객체 생성")
    void Line_Object_Create_Success_Test() {

        // given
        line = new Line();
        players = new Players(Arrays.asList("a", "bb", "ccc", "dddd", "eeeee"));
        height = new Height("5");

        // when
        line.makeLine(players);

        // then
        assertThat(line).isNotNull();
    }

}
