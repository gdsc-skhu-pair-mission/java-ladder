package model;

import java.util.List;

public class FixedGenerateStrategy implements GenerateStrategy {
    private final List<Boolean> fixedValue;

    public FixedGenerateStrategy(List<Boolean> fixedValue) {
        this.fixedValue = fixedValue;
    }

    @Override
    public List<Boolean> generate(int countOfPeople) {
        return fixedValue;
    }
}
