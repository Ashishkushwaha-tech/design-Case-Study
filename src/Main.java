package src;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bird a=new Bird();
        a.setName("b");
        a.setSize("fg");
        a.setWeight("fj");
        System.out.println(a);
        Pigeon p =new Pigeon();
        p.setName("b");
        p.setSize("fg");
        p.setWeight("fj");
        p.setBrain(true);

        Sparrow sp=new Sparrow();
        sp.setName("b");
        sp.setSize("fg");
        sp.setWeight("fj");
        sp.setBigWings(11);

        List<Bird> parent= List.of(a,sp,p);
        List<Bird> children=new ArrayList<>();

        for(Bird b:parent){
            children.add(b.clone());
        }
        Sparrow longLegs=new Sparrow();
        longLegs.setBigWings(24);
        System.out.println(longLegs);
        BirdRegistry registry=new BirdRegistry();
        registry.addBird("longWings",longLegs);
        registry.addBird("bird",a);
        registry.addBird("sparrow",sp);
        registry.addBird("pigeon",p);

        System.out.println(registry.getBird("longWings"));
        System.out.println(registry.getBird("longWings"));
        System.out.println(registry.getBird("longWings"));
        System.out.println(registry.getBird("bird"));
    }
}
