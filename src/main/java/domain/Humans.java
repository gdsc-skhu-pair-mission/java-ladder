package domain;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> getNames(){
        List<String> names = new ArrayList<>();
        for(Human human: humans){
            names.add(human.getName());
        }
        return names;
    }
}
