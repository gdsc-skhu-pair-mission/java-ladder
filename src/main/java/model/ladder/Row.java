package model.ladder;

import model.ladder.strategy.GenerateStrategy;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private final GenerateStrategy generateStrategy;
    private final List<Bridge> bridges = new ArrayList<>();

    public Row(int countOfPlayer, GenerateStrategy generateStrategy) {
        this.generateStrategy = generateStrategy;
        generateRow(countOfPlayer);
    }

    private void generateRow(int countOfPlayer) {
        generateStrategy.generate(countOfPlayer)
                .forEach(bridge -> bridges.add(Bridge.of(bridge)));
    }

    public List<Bridge> getBridges() {
        return bridges;
    }
}
