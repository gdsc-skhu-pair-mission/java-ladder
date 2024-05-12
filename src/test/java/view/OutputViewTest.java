package view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OutputViewTest {
    @Test
    @DisplayName("사람 이름 출력")
    void printPersonName(){
        // given
        OutputView outputView = new OutputView();
        List<String> names = Arrays.asList("pobi", "honux", "crong", "jk");

        // when
        outputView.printNames(names);

        // then
        assertEquals("pobi honux crong jk " , outContent.toString());
    }

}
