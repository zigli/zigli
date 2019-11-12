package cf.tilgiz;

class Parent {
    public Parent(String s){
        System.out.println("Parent contructor with params");
    }

    public Parent() {
        System.out.println("Parent contructor without params");
    }

    public  void print(String s){
        System.out.println("Parent: " + s);
    }
}

public class Child extends Parent {
    public Child(String s) {
        System.out.println("Child contructor with params");
    }

//    public Child() {
//    }

    public  void print(String s){
        System.out.println("Child: " + s);
    }
    public static void main(String[] args){

        Child child = new Child("rwerwe");
        child.print("created");

    }
}
