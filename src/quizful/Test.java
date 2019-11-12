package quizful;


class Base {
    private int i = 5;

    public Base() {
        System.out.println("i = " + getI());
    }

    public int getI() {
        return i;
    }
}

public class Test extends Base{
    private static int i = 10;

    public Test() {
        System.out.println("i = " + super.getI());
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}
