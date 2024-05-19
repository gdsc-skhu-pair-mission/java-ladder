package model;

import static org.assertj.core.api.Assertions.assertThat;

import ladder.model.Person;
import ladder.view.NameManipulateView;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonsTest {

    @Test
    @DisplayName("입력 받은 이름을 쉼표 기준으로 분리시켜 Person 객체 리스트로 만들기")
    void should_SplitPersonAndMakePersonList_When_InputName() {
        // given
        String peopleName = "소정,예은,GDSC";
        List<Person> personList = Arrays.asList(new Person("소정"), new Person("예은"), new Person("GDSC"));

        // then
        assertThat(personList)
                .extracting("name")
                .contains("소정", "예은", "GDSC");
    }

    @Test
    @DisplayName("입력 받은 이름의 길이에 따라 형식에 맞추어 재가공하기")
    void should_ManipulateNames_When_InputNames() {
        // given
        List<Person> personList = Arrays.asList(new Person("gdsc"), new Person("소정"), new Person("예은"), new Person("water"), new Person("a"));
        NameManipulateView nameManipulateView = new NameManipulateView();

        // when
        List<String> manipulatedNames = nameManipulateView.manipulateNames(personList);

        // then
        assertThat(manipulatedNames)
                .contains(" gdsc ", "   소정 ", "   예은 ", " water", "    a ");
    }
}
