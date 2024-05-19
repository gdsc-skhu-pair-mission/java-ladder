package model;

import static org.assertj.core.api.Assertions.assertThat;

import ladder.model.ManipulationPeople;
import ladder.model.Persons;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonsTest {

    @Test
    @DisplayName("입력 받은 이름을 쉼표 기준으로 분리시켜 PersonList에 넣기")
    void should_SplitPersonAndMakePersonList_When_InputName() {
        // given
        String peopleName = "소정,예은,GDSC";

        // when
        Persons personList = new Persons(peopleName);

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
        Persons personList = new Persons(peopleName);

        // when
        ManipulationPeople manipulationPeople = new ManipulationPeople(personList.getPeople());

        // then
        assertThat(manipulationPeople.getManipulationPeopleNames())
                .contains(" gdsc ", "   소정 ", "   예은 ", " water", "    a ");
    }
}
