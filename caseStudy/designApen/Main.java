package caseStudy.designApen;

public class Main {
    public static void main(String[] args) {

        GelPen gelPen=PenFactory.createGelPen()
                .setRefil(new Refil())
                .setCanChangeRefil(false)
                .setWriteStrategy(new SimpleWrite())
                .build();
        System.out.println(gelPen);
    }
}
