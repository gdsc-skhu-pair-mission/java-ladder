package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.TestFootholdGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

class LadderTest {

    private Ladder ladder;
    private Players players;
    private Height height;

    @BeforeEach
    void setUp() {
        Ladder ladder = new Ladder();
        players = new Players(Arrays.asList("a", "bb", "ccc", "dddd", "eeeee"));
        height = new Height("5");
    }

    @Test
    @DisplayName("makeLines 메소드가 정상적으로 작동하는지 테스트 합니다.")
    void Test_MakeLines_Operation() {

        ladder.makeLines(height, players);

        String[] lines = ladder.getLines().toString().split("\n");

        assertEquals(5, lines.length);
    }
}
