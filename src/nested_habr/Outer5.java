package nested_habr;

public class Outer5 {

    void method(){
        System.out.println("Outer Class");
    }

    class Inner5 {
        private Outer5 myOuter;
        private Inner5 myInner;

        Inner5() {
            myOuter = Outer5.this;
            myInner = this;
        }

        void method(){
            myOuter.method();
        }

        public Outer5 getMyOuter() {
            return myOuter;
        }

        public Inner5 getMyInner() {
            return myInner;
        }
    }

    public static void main(String[] args) {
        Outer5 outer5 = new Outer5();
        outer5.method();
        Inner5 inner5 = outer5.new Inner5();
        inner5.method();
        System.out.println(inner5.myOuter);
        System.out.println(inner5);
        System.out.println(inner5.myInner);

        Outer5.Inner5 inner51 = new Outer5().new Inner5();

    }
}
