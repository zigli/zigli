package generics;

interface Interface1{
}

interface Interface2<U>{
}

class Derived1 implements Interface1, Interface2<Object>{
}

class Myclass3<T extends Interface1>{
}

class Myclass4<T extends Interface2<Object>>{
}

class Myclass5<T extends Derived1>{
}

public class Main6 {
    public static void main(String[] args) {
        Myclass3<Interface1> my1 = new Myclass3<>();
        Myclass3<Derived1> my2 = new Myclass3<>();

        Myclass4<Interface2<Object>> my3 = new Myclass4<>();
        Myclass4<Derived1> my4 = new Myclass4<>();

        Myclass5<Derived1> my6 = new Myclass5<>();

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        {
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }
        }
    }
}
