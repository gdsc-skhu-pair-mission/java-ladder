package model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import ladder.model.ManipulationPeople;
import ladder.model.PersonList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PersonListTest {

    @ParameterizedTest
    @MethodSource("generateRandomPeopleNames")
    @DisplayName("입력 받은 이름을 쉼표 기준으로 분리시켜 PersonList에 넣기")
    void should_SplitPersonAndMakePersonList_When_InputName(String peopleName) {
        // given // when
        PersonList personList = new PersonList(peopleName);

        // then
        assertThat(personList.getPeople())
                .extracting("name")
                .isEqualTo(List.of(peopleName.split(",")));
    }

    @Test
    @DisplayName("입력 받은 이름의 길이에 따라 형식에 맞추어 재가공하기")
    void should_ManipulateNames_When_InputNames() {
        // given
        String peopleName = "gdsc,소정,예은,water,a";
        PersonList personList = new PersonList(peopleName);

        // when
        ManipulationPeople manipulationPeople = new ManipulationPeople(personList.getPeople());

        // then
        assertThat(manipulationPeople.getManipulationPeopleNames())
                .contains(" gdsc ", "   소정 ", "   예은 ", " water", "    a ");
    }

    static Stream<String> generateRandomPeopleNames() {
        List<String> names = new ArrayList<>();
        Random random = new Random();
        while (names.size() < 10) {
            String randomNames = generateRandomNames(random);

            if (!hasDuplicatePersonName(randomNames) && !names.contains(randomNames)) {
                names.add(randomNames);
            }
        }
        return names.stream();
    }

    static boolean hasDuplicatePersonName(String randomNames) {
        return Arrays.stream(randomNames.split(","))
                .distinct()
                .count() != randomNames.split(",").length;
    }

    static String generateRandomNames(Random random) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < random.nextInt(1, 7); i++) {
            stringBuilder.append(generateRandomName(random)).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }

    static String generateRandomName(Random random) {
        String[] firstNames = {"소정", "예은", "현수", "한길", "철수", "영희", "홍길동"};
        return firstNames[random.nextInt(firstNames.length)];
    }
}
