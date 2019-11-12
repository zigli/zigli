package quizful.package2;

import quizful.package1.Aaa;

class Bbb extends Aaa {
    public Bbb() {
        super();
        System.out.println("hello from B");
    }

    public static void main (String[] args){
        Aaa b1 = new Bbb(); // you can either do this
        Bbb b2 = new Bbb(); // or this
        Aaa a = new Aaa();
    }
}