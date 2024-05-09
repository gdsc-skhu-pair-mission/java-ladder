package model;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private final GenerateStrategy generateStrategy;
    private final List<Bridge> bridges = new ArrayList<>();

    public Row(int countOfPerson, GenerateStrategy generateStrategy) {
        this.generateStrategy = generateStrategy;
        generateRow(countOfPerson);
    }

    private void generateRow(int countOfPerson) {
        generateStrategy.generate(countOfPerson)
                .forEach(bridge -> bridges.add(Bridge.of(bridge)));
    }

    public List<Bridge> getBridges() {
        return bridges;
    }
}
