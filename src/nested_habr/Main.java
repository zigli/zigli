package nested_habr;

class A {
    private static int iPrivVar;
    private int iVar;

    public static int getiPrivVar() {
        return iPrivVar;
    }

    public int getiVar() {
        return iVar;
    }

    class B {

        void setPrivateOfA(int var)
        {
            A.iPrivVar = var;
            iVar = 2;
        }
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println(A.getiPrivVar());
        A ins = new A();
        System.out.println(ins.getiVar());
        A.B b = ins.new B();
        b.setPrivateOfA(4);
        System.out.println(A.getiPrivVar());
        System.out.println(ins.getiVar());

    }
}
