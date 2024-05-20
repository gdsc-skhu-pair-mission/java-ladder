package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

class LadderTest {

    private Ladder ladder;
    private Height height;

    @BeforeEach
    void setUp() {
        ladder = new Ladder();
        height = new Height("5");
    }

    @Test
    @DisplayName("generateLadder 메소드가 정상적으로 작동하는지 테스트 합니다.")
    void generateLadderTest() {

        int size = 5;
        Lines lines = ladder.generateLadder(height, size);

        lines.getLines().forEach(line -> {
            assertEquals(size, line.getLine().length);
        });

        assertEquals(Integer.parseInt(height.getHeight()), lines.getLines().size());
    }
}
