package caseStudy.designApen;

public class SimpleWrite implements WriteStrategy{
    @Override
    public void write() {
        System.out.println("simple write");
    }
}
