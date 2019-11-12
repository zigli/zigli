package static_members;

public abstract class AbstractClass {

    public static AbstractClass CreateObject(){
        return new ConcreteClass();
    }

    public abstract void method();

}
