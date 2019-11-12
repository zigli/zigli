package quizful;

public class Parent {

    private void whoAreYou(){ System.out.println("I'm private parent"); }
    public void whoAreYou1(){ System.out.println("I'm public parent"); }
    public static void whoAreYou2(){ System.out.println("I'm static parent"); }

    public static void main(String []args){
        System.out.println("Parent p2 = new Parent()");
        Parent p2 = new Parent();
        p2.whoAreYou1();
        p2.whoAreYou();
        p2.whoAreYou2();

        System.out.println("========================");

        System.out.println("Parent p = new Child()");
        Parent p = new Child();
        p.whoAreYou1();
        p.whoAreYou();
        p.whoAreYou2();

        System.out.println("========================");

        System.out.println("Child p4 = (Child) p");
        Child p4 = (Child) p;
        p4.whoAreYou1();
        p4.whoAreYou();
        p4.whoAreYou2();

        System.out.println("========================");

        System.out.println("Child p1 = new Child()");
        Child p1 = new Child();
        p1.whoAreYou1();
        p1.whoAreYou();
        p1.whoAreYou2();

        System.out.println("========================");

        System.out.println("Parent p3 = p1");
        Parent p3 = p1;
        p3.whoAreYou1();
        p3.whoAreYou();
        p3.whoAreYou2();

    }
}

class Child extends Parent {
    public void whoAreYou(){ System.out.println("I'm public child"); }
    public void whoAreYou1(){ System.out.println("I'm public child"); }
    public static void whoAreYou2(){ System.out.println("I'm static child"); }
}