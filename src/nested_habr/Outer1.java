package nested_habr;

public class Outer1 {
    public static void main(String[] args) {
        Runnable anonym = () -> {
            System.out.println("Test");
        };

        String str = anonym.getClass().toString();
        System.out.println(str);
        anonym.run();

        Runnable anonym1 = new Runnable() {
            public void run() {
            }
        };
    }
}
