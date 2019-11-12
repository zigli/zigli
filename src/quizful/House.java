package quizful;

import java.util.ArrayList;
import java.util.List;

class Building {
    Building() {
        System.out.print("b ");
    }

    Building(String name) {
        this();
        System.out.print("bn " + name);
    }
}
public class House extends Building {
    House(){
        System.out.print("h ");
    }
    House(String name) {
        this();
        System.out.print("hn " + name);
    }
    public static void main(String[] args) {
        new House("x ");
        System.out.println("============");
        new Building("x ");
        System.out.println("============");

        List a = new ArrayList();
        List b = new ArrayList();
        Class c1 = a.getClass();
        System.out.println(a.getClass());
        Class c2 = b.getClass();
        System.out.println(b.getClass());

        System.out.println(a.equals(b));

    }
}
