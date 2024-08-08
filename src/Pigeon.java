package src;
import src.Bird;
public class Pigeon extends Bird{
    private  boolean brain;
    public Pigeon(){

    }
    public Pigeon(Pigeon oldPigeon){
        super(oldPigeon);
        this.brain=true;
    }

    public boolean isBrain() {
        return brain;
    }

    public void setBrain(boolean brain) {
        this.brain = brain;
    }
    public Pigeon clone(){
        return new Pigeon(this);
    }
}
