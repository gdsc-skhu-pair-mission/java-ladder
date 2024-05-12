package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private List<Boolean> points = new ArrayList<>();

    public Line (int personnel) {
        Random random = new Random();
        points.add(random.nextBoolean());
        for (int i = 0; i < personnel - 2; i++) {
            boolean previous = points.get(i);
            boolean next = random.nextBoolean() && !previous;// 사다리 생성 로직
            points.add(next);
        }
    }

    public List<Boolean> getPoints() {
        return points;
    }

}