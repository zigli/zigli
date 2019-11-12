package quizful;

public class LinkageTest {
    public static class Parent{

        public void test(){
            System.out.println("parent::test");
        }
    }

    public static class Child extends Parent{

        public void test(){
            System.out.println("child::test");
        }
    }

    public static class Tester{

        public void test(Parent obj){
            System.out.println("Testing parent...");
            obj.test();
        }

        public void test(Child obj){
            System.out.println("Testing child...");
            obj.test();
        }
    }

    public static void main(String[] args){
        Parent obj = new Child();
        Child obj1 = new Child();
        Parent obj2 = new Parent();
        Tester t = new Tester();
        t.test(obj);
        t.test(obj1);
        t.test(obj2);
    }
}
