package nested_habr;

public class Outer3 {
    private static int prvOuterVar;

    public Outer3() {
    }

    static class Nested3 {
        int getStaticOuterVar() {
            return Outer3.prvOuterVar;
        }

        void setStaticOuterVariable(int var) {
            Outer3.prvOuterVar = var;
        }
    }

    public static void main(String[] args) {
        Outer3.prvOuterVar = 19;

        Outer3.Nested3 nestedObj = new Outer3.Nested3();
        System.out.println("nestedObj.getStaticOuterVar() = " + nestedObj.getStaticOuterVar());
        nestedObj.setStaticOuterVariable(77);
        System.out.println("Outer3.prStOuterVar = " + Outer3.prvOuterVar);

    }
}