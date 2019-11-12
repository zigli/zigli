package generics;

interface Interface11{
}

interface Interface22<U> extends Interface11{
}

class Derived2 implements Interface11,Interface22<Object> {
}

class Derived3 implements Interface22<Object>{
}

class MyClass6<T extends Interface11>{
}

class MyClass7<T extends Interface22<Object>>{
}

public class Main7 {
    public static void main(String[] args) {
        MyClass6<Derived2> my1 = new MyClass6<>();
        MyClass6<Derived3> my2 = new MyClass6<>();
        MyClass6<Interface11> my3 = new MyClass6<>();
        MyClass6<Interface22<Object>> my4 = new MyClass6<>();

        MyClass7<Derived2> my5 = new MyClass7<>();
        MyClass7<Derived3> my6 = new MyClass7<>();
//        MyClass7<Interface11> my7 = new MyClass7<>(); // compilation error
        MyClass7<Interface22<Object>> my8 = new MyClass7<>();
    }
}
