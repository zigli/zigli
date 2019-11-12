package nested_habr;

public class OuterStaticInit {

    public static int tempVar = 8;

    void methodOut(){
        System.out.println("Hi");
    }

    static {
        class LocalInit {
            public static final int i=11;
            LocalInit() {
                tempVar = 3;
                System.out.println("From static init");

            }
        }
        LocalInit localInit = new LocalInit();
        //System.exit(0);
    }

    public OuterStaticInit() {
        outerMethod();
    }

    void outerMethod(){
        class ClassInside {
            public static final int i=11;
            void method(){
                tempVar = 9;
                methodOut();
            }

            public ClassInside() {
                method();
            }
        }
        ClassInside inside = new ClassInside();
    }

    public static void main(String[] args) {
        System.out.println("From main");
        System.out.println(OuterStaticInit.tempVar);
        new OuterStaticInit();
        System.out.println(OuterStaticInit.tempVar);

    }
}
