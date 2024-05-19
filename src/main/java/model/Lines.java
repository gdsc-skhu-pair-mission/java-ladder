package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lines {

    private final List<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public List<List<Boolean>> toBooleanList() {
        return lines.stream()
                .map(this::convertLineToBooleanList)
                .collect(Collectors.toList());
    }

    private List<Boolean> convertLineToBooleanList(Line line) {
        boolean[] points = line.getLine();
        return convertArrayToBooleanList(points);
    }

    private List<Boolean> convertArrayToBooleanList(boolean[] points) {
        List<Boolean> booleanList = new ArrayList<>();
        for (boolean point : points) {
            booleanList.add(point);
        }
        return booleanList;
    }

}
