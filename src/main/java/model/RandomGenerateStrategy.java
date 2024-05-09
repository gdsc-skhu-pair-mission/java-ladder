package model;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerateStrategy implements GenerateStrategy {
    private static final int BRIDGE_NOT_CONNECTED = 0;

    @Override
    public List<Boolean> generate(int countOfPeople) {
        List<Boolean> bridges = new ArrayList<>();

        for (int i = 0; i < countOfPeople - 1; i++) {
            if (wasPreviousBridgeConnected(bridges, i)) {
                bridges.add(false);
                continue;
            }
            bridges.add(decideBridgeConnectionByRandomNumber());
        }
        return bridges;
    }

    private static boolean wasPreviousBridgeConnected(List<Boolean> bridges, int currentIndex) {
        if (currentIndex == 0) {
            return false;
        }
        return bridges.get(currentIndex - 1);
    }

    private boolean decideBridgeConnectionByRandomNumber() {
        return (int) (Math.random() * 2) != BRIDGE_NOT_CONNECTED;
    }
}
