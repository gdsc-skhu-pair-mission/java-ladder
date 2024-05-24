package view;

import domain.Message;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OutputViewTest {

    @Test
    @DisplayName("이름 입력 메시지 출력")
    void should_PrintInputHumanNameMessage() {
        // given
        InputView inputView = new InputView();

        // when
        String message = inputView.printNamesMessage();

        // then
        assertThat(message).isEqualTo(Message.INPUT_HUMAN_NAME.toString());
    }

    @Test
    @DisplayName("사다리 높이 입력 메시지 출력")
    void should_PrintInputLadderHeightMessage() {
        // given
        InputView inputView = new InputView();

        // when
        String message = inputView.printHeight();

        // then
        assertThat(message).isEqualTo(Message.INPUT_LADDER_HEIGHT.toString());
    }

    @Test
    @DisplayName("참여자 이름 목록 출력")
    void should_PrintNamesSuccessfully() {
        // given
        List<String> names = Arrays.asList("pobi", "crong", "honux", "jk");
        OutputView outputView = new OutputView();

        // when
        String result = outputView.printNames(names);

        // then
        assertThat(result).isEqualTo("pobi crong honux jk");
    }

    @Test
    @DisplayName("사다리 구조 출력")
    void should_PrintLadderSuccessfully() {
        // given
        List<List<Boolean>> lines = Arrays.asList(
                Arrays.asList(true, false, true),
                Arrays.asList(false, true, false)
        );
        OutputView outputView = new OutputView();

        // when
        String result = outputView.printLadder(lines);

        // then
        String expectedOutput = "    |-----|     |-----|\n    |     |-----|     |\n";
        assertThat(result).isEqualTo(expectedOutput);
    }
}
