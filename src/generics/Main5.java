package generics;

class Base{
}

class Derived extends Base{
}

class MyClass2<T extends Base>{

}

public class Main5 {
    public static void main(String[] args) {
        MyClass2<Base> mv1 = new MyClass2<>();
//        MyClass2<String> mv2 = new MyClass2<>();  // Ошибка
        MyClass2<Derived> mv3 = new MyClass2<>();
    }
}
