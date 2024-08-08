package caseStudy.designApen;

public abstract class Pen {
    private String name;
    private String company;
    private int price;
    private PenType type;
    private WriteStrategy writeStrategy;
   public abstract Colour  getColour();
   public Pen(PenType penType,WriteStrategy writeStrategy){
       this.writeStrategy=writeStrategy;
       this.type=penType;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PenType getType() {
        return type;
    }

    public void setType(PenType type) {
        this.type = type;
    }

    public WriteStrategy getWriteStrategy() {
        return writeStrategy;
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }

}
