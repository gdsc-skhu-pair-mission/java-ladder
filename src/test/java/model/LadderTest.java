package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

class LadderTest {

    private Ladder ladder;
    private Players players;
    private Height height;

    @BeforeEach
    void setUp() {
        ladder = new Ladder();
        players = new Players(Arrays.asList("a", "bb", "ccc", "dddd", "eeeee"));
        height = new Height("5");
    }

    @Test
    @DisplayName("generateLadder 메소드가 정상적으로 작동하는지 테스트 합니다.")
    void TEST_generateLadder_OPERATION() {

        String ladderResult = ladder.generateLadder(height, players);
        String[] lines = ladderResult.split("\n");

        assertEquals(5, lines.length);
    }
}
