package generics;

class MyClass1{

    public <T> void method(T arg){
        T var = arg;
        System.out.println(var);
    }

}


public class Main2 {
    public static void main(String[] args) {
        MyClass1 inst = new MyClass1();
        inst.method("asfa");
        inst.method(123);

    }
}
