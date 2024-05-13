package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LadderTest {

    @Test
    @DisplayName("사다리를 생성합니다.")
    void createLadder() {
        // given
        int numberOfPlayers = 4;
        int height = 5;

        // when
        Ladder ladder = new Ladder(numberOfPlayers, height);

        // then
        assertNotNull(ladder);
    }

    @Test
    @DisplayName("사다리의 높이를 확인합니다.")
    void ladderHeight() {
        // given
        int numberOfPlayers = 4;
        int height = 5;

        // when
        Ladder ladder = new Ladder(numberOfPlayers, height);
        List<Line> lines = ladder.getLines();

        // then
        assertEquals(height, lines.size());
    }

    @Test
    @DisplayName("사다리의 너비를 확인합니다.")
    void ladderWidth() {
        // given
        int numberOfPlayers = 4;
        int height = 5;

        // when
        Ladder ladder = new Ladder(numberOfPlayers, height);
        List<Line> lines = ladder.getLines();

        // then
        for (Line line : lines) {
            assertEquals(numberOfPlayers - 1, line.getPoints().size());
        }
    }

}
