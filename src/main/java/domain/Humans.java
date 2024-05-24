package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Humans {
    private List<Human> humans;

    public Humans(){
        this.humans = new ArrayList<>();
    }

    public void addHuman(Human human){
        humans.add(human);
    }
    public List<Human> getHumans(){
        return humans;
    }
    public List<String> getNames() {
        return humans.stream()
                .map(Human::getName)
                .collect(Collectors.toList());
    }
}
