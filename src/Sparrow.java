package src;

public class Sparrow extends Bird {
    private int bigWings;
    public Sparrow(){

    }
    public Sparrow(Sparrow oldSparrow){
        super(oldSparrow);
        this.bigWings=oldSparrow.bigWings;
    }


    public int getBigWings() {
        return bigWings;
    }

    public void setBigWings(int bigWings) {
        this.bigWings = bigWings;
    }

    public Sparrow clone(){
        return new Sparrow(this);
    }
}
