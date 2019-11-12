package generics;

class MyClass<T>{
    public T field;
    public void method(){
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<String> instance = new MyClass<>();
        instance.field = "Test";
        instance.method();

        MyClass<Integer> instance1 = new MyClass<>();
        instance1.field = 123;
        instance1.method();
    }


}
