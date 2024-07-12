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
        sp.setBigWings(true);

        List<Bird> parent= List.of(a,sp,p);
        List<Bird> children=new ArrayList<>();

        for(Bird b:parent){
            children.add(b.cloneable());
        }

    }
}
