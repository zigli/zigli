package static_members;


class MyClass {
    public final static int field;

    static {
        field = 10;
        System.out.println("Static block");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MyClass.field);

        AbstractClass abstractClass = ConcreteClass.CreateObject();
        abstractClass.method();

        AbstractClass abstractClass1 = AbstractClass.CreateObject();
        abstractClass1.method();

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.method();

    }
}
