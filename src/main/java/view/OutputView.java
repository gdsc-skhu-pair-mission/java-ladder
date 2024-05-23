package view;

import domain.Message;

import java.util.List;

public class OutputView {

    public String printNames(List<String> names) {
        StringBuilder output = new StringBuilder();
        for (String name : names) {
            output.append(name).append(Message.SPACE.toString());
        }
        String result = output.toString().trim();
        System.out.print(result);
        return result;
    }

    public String printLadder(List<List<Boolean>> lines) {
        StringBuilder output = new StringBuilder();
        for (List<Boolean> line : lines) {
            output.append("\n");
            output.append(Message.FIRST_SPACE.toString()).append(Message.COLUMN.toString());
            for (Boolean point : line) {
                output.append(point ? Message.BRIDGE.toString() + Message.COLUMN.toString() : Message.SPACE.toString().repeat(Message.BRIDGE.toString().length()) + Message.COLUMN.toString());
            }
        }
        String result = output.toString();
        System.out.print(result);
        return result;
    }
}
