package model;

import static org.junit.jupiter.api.Assertions.*;

import model.ladder.strategy.RandomGenerateStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

class RandomGenerateStrategyTest {
    @Test
    @DisplayName("생성한 다리의 크기가 예상 다리의 크기와 같은지 확인")
    void should_CreateCorrectSizeBridge() {
        // given
        RandomGenerateStrategy strategy = new RandomGenerateStrategy();
        int numberOfPeople = 4;
        int expectedResult = numberOfPeople - 1;

        // when
        List<Boolean> actualResult = strategy.generate(numberOfPeople);

        // then
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult.size());
    }

    @Test
    @DisplayName("연속된 다리가 생성되지 않는지 확인")
    void should_NotCreateConsecutiveBridge() {
        // given
        RandomGenerateStrategy strategy = new RandomGenerateStrategy();
        int numberOfPeople = 100;

        // when
        List<Boolean> actualResult = strategy.generate(numberOfPeople);
        boolean consecutiveBridge = false;

        for (int i = 0; i < actualResult.size() - 1; i++) {
            if (actualResult.get(i) && actualResult.get(i + 1)) {
                consecutiveBridge = true;
                break;
            }
        }

        // then
        assertNotNull(actualResult);
        assertFalse(consecutiveBridge, "연속된 다리가 생성되었습니다.");
    }
}
