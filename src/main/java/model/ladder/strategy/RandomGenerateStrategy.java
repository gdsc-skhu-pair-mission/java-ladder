package model.ladder.strategy;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerateStrategy implements GenerateStrategy {
    private static final int BRIDGE_UNCONNECTED = 0;

    @Override
    public List<Boolean> generate(int countOfPlayer) {
        if (countOfPlayer < 2) {
            throw new IllegalArgumentException("플레이어는 최소 2명 이상이어야 합니다.");
        }
        int countOfBridge = countOfPlayer - 1;

        List<Boolean> bridges = new ArrayList<>();
        for (int i = 0; i < countOfBridge; i++) {
            if (wasPreviousBridgeConnected(bridges, i)) {
                bridges.add(false);
                continue;
            }
            bridges.add(decideBridgeConnection());
        }
        return bridges;
    }

    private boolean wasPreviousBridgeConnected(List<Boolean> bridges, int currentIndex) {
        if (currentIndex == 0) {
            return false;
        }
        return bridges.get(currentIndex - 1);
    }

    private boolean decideBridgeConnection() {
        return (int) (Math.random() * 2) != BRIDGE_UNCONNECTED;
    }
}
