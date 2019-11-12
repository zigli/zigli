package nested_class;

class MyClass{
    class Inner{
        void method(){
            System.out.println("Method from Inner Class");
        }
    }
}

class MyClass1{

    private static int field = 0;

    class Inner{
        void method(int a){
            field = a;
            System.out.println(field);
        }
    }
}

class MyClass2{

    private int field = 0;

    class Inner{
        MyClass2 instance = new MyClass2();

        public void method(int a){
            instance.field = a;
            System.out.println(instance.field);
        }
    }

}

class BaseClass{
    void methodFromBaseClass(){
        System.out.println("Method from Base Class");
    }
}

class MyClass3{
    class Inner extends BaseClass{
        public void methodFromInnerClass(){
            System.out.println("Method from Inner Class");
        }
    }
}

class MyClass4 extends BaseClass{
    class Inner{
        void methodFromInnerClass(){
            System.out.println("Method from Inner Class");
        }
    }
}

class MyClass5{
    static class Nested{
        void methodFromNested(){
            System.out.println("Method from Nested class");
        }
        static void staticMethodFromNested(){
            System.out.println("Static method from Nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        MyClass.Inner inner = myClass.new Inner();
        inner.method();

        MyClass.Inner myClassInner = new MyClass(). new Inner();
        myClassInner.method();

        MyClass1.Inner myClassInner1 = new MyClass1().new Inner();
        myClassInner1.method(1);

        MyClass2.Inner myClassInner2 = new MyClass2().new Inner();
        myClassInner2.method(1);

        MyClass3.Inner myClassInner3 = new MyClass3().new Inner();
        myClassInner3.methodFromInnerClass();
        myClassInner3.methodFromBaseClass();

        MyClass4.Inner myClassInner4 = new MyClass4().new Inner();
        myClassInner4.methodFromInnerClass();

        MyClass4 myClass4 = new MyClass4();
        myClass4.methodFromBaseClass();

        MyClass5.Nested.staticMethodFromNested();

        MyClass5.Nested myNestedClass = new MyClass5.Nested();
        myNestedClass.methodFromNested();


    }
}
