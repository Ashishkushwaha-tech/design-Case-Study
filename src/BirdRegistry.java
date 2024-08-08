package src;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistry {
    Map<String,Bird> birdRegistry=new HashMap<>();

    public void addBird(String name,Bird bird){
        birdRegistry.put(name,bird);
    }
    public Bird getBird(String name){
        return birdRegistry.get(name).clone();
    }
}
