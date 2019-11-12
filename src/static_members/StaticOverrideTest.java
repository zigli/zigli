package static_members;

class Parent{

    /*
     * original static method in super class which will be hidden
     * in subclass.
     */
    public static void nameStatic(){
        System.out.println("Static method from Parent");
    }
    public void nameNonStatic(){
        System.out.println("Non static method from Parent");
    }
}

class Child extends Parent{

    /*
     * Static method with same signature as in super class,
     * Since static method can not be overridden, this is called
     * method hiding. Now, if you call Child.name(), this method
     * will be called, also any call to name() in this particular
     * class will go to this method, because super class method is hidden.
     */
    public static void nameStatic(){
        System.out.println("Static method from Child");
    }
    public void nameNonStatic(){
        System.out.println("Non static method from Child");
    }
}

public class StaticOverrideTest {
    public static void main(String args[]) {

        Parent.nameStatic();
        Child.nameStatic();

        System.out.println("=== Parent p = new Parent() ================");

        Parent p = new Parent();
        p.nameStatic();
        p.nameNonStatic();   // should call static method from super class (Parent)
        // because type of reference variable
        // p is Parent

        System.out.println("=== p = new Child(); ================");
        p = new Child();
        p.nameStatic();
        p.nameNonStatic();  // as per overriding rules this should call to child's static
        // overridden method. Since static method can not be overridden
        // , it will call parent static method
        // because Type of p is Parent.
        System.out.println("=== Child c = new Child(); ================");
        Child c = new Child();
        c.nameStatic();
        c.nameNonStatic();  // will call child static method because static method
        // get called by type of Class
        System.out.println("=== Parent p1 = c; ================");
        Parent p1 = c;
        p1.nameStatic();
        p1.nameNonStatic();

    }
}
