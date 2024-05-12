package view;

import java.util.List;

public class OutputView {
    private final static int NAME_WIDTH = 5;



    public void printResultSentence(StringBuilder ladder, List<String> playerNames) {
        System.out.println("실행결과");

        printPlayerNames(playerNames);

        System.out.println(ladder);
    }

    public void printPlayerNames(List<String> playerNames) {
        StringBuilder builder = new StringBuilder();

        for (String name : playerNames) {
            String formattedName = formatName(name, NAME_WIDTH);
            builder.append(formattedName).append(" ");
        }

        System.out.println(builder);
    }

    private String formatName(String name, int width) {
        if (name.length() > width) {
            return name.substring(0, width);
        }
        return String.format("%" + width + "s", name);
    }
}