package quizful;

public class Clazz{
    int x = 1;
    public int getX(){
        return x;
    }
    public static void main(String[] args){
        Clazz c2 = new Clazz();
        System.out.println(c2.x + " " + c2.getX());

        SubClass c1 = new SubClass();
        System.out.println(c1.x + " " + c1.getX());

        Clazz c11 = c1;
        System.out.println(c11.x + " " + c11.getX());

        Clazz c = new SubClass();
        System.out.println(c.x + " " + c.getX());

        SubClass c4 = (SubClass) c;
        System.out.println(c4.x + " " + c4.getX());

    }
}

class SubClass extends Clazz{
    int x = 2;
    public int getX(){
        return x;
    }

}