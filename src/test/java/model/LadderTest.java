package model;

import model.ladder.Ladder;
import model.ladder.strategy.GenerateStrategy;
import model.ladder.strategy.RandomGenerateStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LadderTest {
    @Test
    @DisplayName("정상적으로 고정 생성 전략 사다리 생성")
    void should_CreateLadderObjectSuccessfullyWithFixedGenerateStrategy() {
        // given
        int countOfPlayer = 4;
        int countOfHeight = 1;
        List<Boolean> expectedConnection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < countOfPlayer - 1; i++) {
            expectedConnection.add(random.nextBoolean());
        }
        GenerateStrategy fixedGenerateStrategy = new FixedGenerateStrategy(expectedConnection);

        // when
        Ladder ladder = new Ladder(fixedGenerateStrategy);
        ladder.init(countOfPlayer, countOfHeight);

        // then
        assertNotNull(ladder);
        List<List<Boolean>> actualConnection = ladder.getLadderShape();
        assertEquals(countOfHeight, actualConnection.size());
        assertEquals(expectedConnection, actualConnection.get(0));
    }

    @Test
    @DisplayName("정상적으로 랜덤 생성 전략 사다리 생성 - 인원 수와 높이만 확인")
    void should_CreateLadderObjectSuccessfullyWithRandomGenerateStrategy() {
        // given
        GenerateStrategy generateStrategy = new RandomGenerateStrategy();
        int countOfPlayer = 4;
        int countOfHeight = 5;

        // when
        Ladder ladder = new Ladder(generateStrategy);
        ladder.init(countOfPlayer, countOfHeight);

        // then
        assertNotNull(ladder.getLadderShape());
        assertEquals(countOfHeight, ladder.getRowSize());
        assertEquals(countOfHeight, ladder.getLadderShape().size());
    }
}
