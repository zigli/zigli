package nested_habr;

public class AnyClass1 {
    public static void main(String[] args) {
        new AnyClass1(){
            {
                this.anyNewMethod();
            }
            void anyNewMethod(){
                System.out.println("Hello from anonimous");
            }
        };
    }
}
