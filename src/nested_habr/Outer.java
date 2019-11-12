package nested_habr;

public class Outer {
    void method(){
        System.out.println("method from Outer");
    }
    public static void main(String[] args) {
        Outer outer = new Outer(){
            {
                super.method();
                method();
                methodA();
            }
            @Override
            void method() {
                System.out.println("method from anonymous");
            }
            void methodA(){
                System.out.println("methodA from anonymous");
            }
        };
        outer.method();
    }
}
