package view;

import domain.Message;

import java.util.List;

public class OutputView {


    public void printNames(){
        System.out.println(Message.INPUT_HUMAN_NAME);
    }

    public void printHeight(){
        System.out.println(Message.INPUT_LADDER_HEIGHT);
    }

    public void printNames(List<String> names){
        for (String name : names) {
            System.out.print(name + Message.SPACE);
        }
       // System.out.println();
    }

    public void printLadder(List<List<Boolean>> lines){
        for (List<Boolean> line : lines) {
            System.out.print(Message.FIRST_SPACE);
            System.out.print(Message.COLUMN);
            for (Boolean point : line) {
                System.out.print(point ? Message.BRIDGE.toString() + Message.COLUMN.toString() : Message.SPACE.toString().repeat(Message.BRIDGE.toString().length()) + Message.COLUMN);            }
            System.out.println();
        }
    }
}
