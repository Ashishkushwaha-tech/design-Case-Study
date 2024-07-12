package src;

public class Bird {

    private String name;

    private String size;
    private String weight;


    public Bird(Bird oldBird){
        this.name=oldBird.name;
        this.size= oldBird.size;
        this.weight= oldBird.weight;
    }

    public Bird(){

    }
    public Bird cloneable(){
        return new Bird(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


}
