package model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonListTest {

    @Test
    @DisplayName("입력 받은 이름을 쉼표 기준으로 분리시켜 PersonList에 넣기")
    void should_SplitPersonAndMakePersonList_When_InputName() {
        // given
        String peopleName = "소정,예은,GDSC";
        PersonList personList = new PersonList(peopleName);

        // when
        personList.personNameInput();

        // then
        assertThat(personList.getPeople())
                .extracting("name")
                .contains("소정", "예은", "GDSC");
    }

}
