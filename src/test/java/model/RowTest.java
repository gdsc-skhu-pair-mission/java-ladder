package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.ladder.Bridge;
import model.ladder.Row;
import model.ladder.strategy.RandomGenerateStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RowTest {
    @Test
    @DisplayName("정상적으로 행 객체 생성")
    void should_CreateRowObjectSuccessfully() {
        // given
        RandomGenerateStrategy randomGenerateStrategy = new RandomGenerateStrategy();
        int countOfPlayer = 4;
        int expectedResult = countOfPlayer - 1;

        // when
        Row row = new Row(countOfPlayer, randomGenerateStrategy);
        List<Bridge> actualResult = row.getBridges();

        // then
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult.size());
    }

    @Test
    @DisplayName("정해진 다리 생성 전략에 따라 행 객체 생성")
    void should_CreateCorrectSizeRow() {
        // given
        int countOfPlayer = 4;
        List<Boolean> expectedConnection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < countOfPlayer - 1; i++) {
            expectedConnection.add(random.nextBoolean());
        }
        FixedGenerateStrategy fixedGenerateStrategy = new FixedGenerateStrategy(expectedConnection);

        // when
        Row row = new Row(countOfPlayer, fixedGenerateStrategy);
        List<Boolean> actualConnection = row.getBridges().stream()
                .map(Bridge::isExist)
                .toList();

        // then
        assertNotNull(actualConnection);
        assertEquals(expectedConnection, actualConnection);
    }
}
