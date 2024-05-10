package model;

import model.ladder.Ladder;
import model.ladder.strategy.GenerateStrategy;
import model.ladder.strategy.RandomGenerateStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LadderTest {
    @Test
    @DisplayName("정상적으로 사다리 객체 생성")
    void should_CreateLadderObjectSuccessfully() {
        // given
        GenerateStrategy generateStrategy = new RandomGenerateStrategy();

        // when
        Ladder ladder = new Ladder(generateStrategy);

        // then
        assertNotNull(ladder);
    }

    @Test
    @DisplayName("정상적으로 사다리 초기화")
    void should_InitializeLadderSuccessfully() {
        // given
        GenerateStrategy generateStrategy = new RandomGenerateStrategy();
        int countOfPlayer = 4;
        int countOfHeight = 5;

        // when
        Ladder ladder = new Ladder(generateStrategy);
        ladder.init(countOfPlayer, countOfHeight);

        // then
        assertNotNull(ladder);
        assertEquals(countOfHeight, ladder.getRowSize());
    }

    @Test
    @DisplayName("정상적으로 사다리 정보 반환")
    void should_ReturnLadderInformationSuccessfully() {
        // given
        GenerateStrategy generateStrategy = new RandomGenerateStrategy();
        int countOfPlayer = 4;
        int countOfHeight = 5;

        // when
        Ladder ladder = new Ladder(generateStrategy);
        ladder.init(countOfPlayer, countOfHeight);

        // then
        assertNotNull(ladder.getLadderInformation());
    }
}
