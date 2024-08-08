package caseStudy.designApen;

public class FastWrite implements WriteStrategy{
    @Override
    public void write() {
        System.out.println("fast writing");
    }
}
