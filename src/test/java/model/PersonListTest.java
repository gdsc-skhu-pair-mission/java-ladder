package model;

import static org.assertj.core.api.Assertions.assertThat;

import ladder.model.PersonList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonListTest {

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

    @Test
    @DisplayName("입력 받은 이름의 길이에 따라 형식에 맞추어 재가공하기")
    void should_ManipulateNames_When_InputNames() {
        // given
        String peopleName = "gdsc,소정,예은,water,a";
        PersonList personList = new PersonList(peopleName);
        personList.personNameInput();

        // when
        personList.manipulateNames();

        // then
        assertThat(personList.getManipulationPeopleNames())
                .contains(" gdsc ", "   소정 ", "   예은 ", " water", "    a ");
    }
}
