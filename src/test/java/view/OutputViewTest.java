package view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OutputViewTest {
    @Test
    @DisplayName("사람 출력")
    void 사람이름_출력하기(){
        OutputView outputView = new OutputView();
        String[] personnal = {"pobi", "honux", "crong", "jk"};
        String result = "pobi honux crong jk ";
        assertEquals(result, outputView.getClass(personnal));
    }

}
