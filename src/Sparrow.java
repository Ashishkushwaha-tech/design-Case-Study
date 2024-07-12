package src;

public class Sparrow extends Bird {
    private boolean bigWings;
    public Sparrow(){

    }
    public Sparrow(Sparrow oldSparrow){
        super(oldSparrow);
        this.bigWings=oldSparrow.bigWings;
    }


    public boolean isBigWings() {
        return bigWings;
    }

    public void setBigWings(boolean bigWings) {
        this.bigWings = bigWings;
    }

    public Sparrow cloneable(){
        return new Sparrow(this);
    }
}
