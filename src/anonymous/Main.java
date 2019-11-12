package anonymous;

interface Interface1 {
    void method();
}

interface  Interface2{
    void method();

    int getValue();
}

class ConcreteClass implements Interface2{

    protected int protectedField = 10;

    @Override
    public void method() {
        System.out.println("ConcreteClass method");
    }

    @Override
    public int getValue() {
        return protectedField;
    }
}


public class Main {

    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Computer[] c = {c1, c2, m1};
        Phone[] p = {p1, p2, m2.instance};

        for (Computer t : c) {
            t.process();
        }

        for (Phone t : p) {
            t.process();
        }

        System.out.println("============================================");

        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method from anonymous class");
            }
        };

        instance.method();

        System.out.println("============================================");

        Interface1 instance1 = new Interface1() {
            private int d = 1;
            protected String str = "Anonymous class";
            public double r;

            @Override
            public void method() {
                d = 10;
                System.out.println("instance1 d= " + d + ", str= " + str + ", r= " + r);
            }
        };

        instance1.method();

        System.out.println("============================================");

        Interface1 instance2 = new Interface1() {
            private int field = 10;

            @Override
            public void method() {
                field = 20;
                System.out.println("instance2 field= " + getField());
            }

            public int getField() {
                return field;
            }

        };

        instance2.method();

        System.out.println("============================================");

        int n = 100;

        Interface1 instance3 = new Interface1() {

            int field = 11;

            @Override
            public void method() {
                field = n;
                System.out.println("instance field=" + field);
            }
        };

        instance3.method();
        //n = 120;
        instance3.method();

        System.out.println("============================================");

        Interface2 instance4 = new Interface2() {
            int field;

            @Override
            public void method() {
                field = 100;
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        Interface2 instance5 = new Interface2() {
            int field = 1;

            @Override
            public void method() {
                field = instance4.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        System.out.println(instance4.getValue());
        instance4.method();
        System.out.println(instance4.getValue());
        System.out.println(instance5.getValue());
        instance5.method();
        System.out.println(instance5.getValue());

        System.out.println("============================================");

        ConcreteClass instance6 = new ConcreteClass();
        int value = instance6.getValue();
        System.out.println(value);
        instance6.method();

        ConcreteClass instance7 = new ConcreteClass(){
            @Override
            public void method() {
                System.out.println("ConcreteClass method from anonymous");
            }
        };

        instance7.method();

        System.out.println("-------------------");

        Interface2 instance8 = new Interface2() {
            int field = 3;

            @Override
            public void method() {
                System.out.println("Interface-Interface method from anonymous");
            }

            @Override
            public int getValue() {
                return this.field;
            }
        };
        instance8.method();
        int value1 = instance8.getValue();
        System.out.println(value1);

        System.out.println("-------------------");

        Interface2 instance9 = new ConcreteClass(){
            int field = 5;

            @Override
            public void method() {
                System.out.println("Interface-ConcreteClass method from anonymous");
            }

            @Override
            public int getValue() {
                return this.field + super.getValue();
            }
        };

        instance9.method();
        int value2 = instance9.getValue();
        System.out.println(value2);

        System.out.println("============================================");

        Company str1 = Company.GOOGLE;
        System.out.println(str1);
        System.out.println(str1.getValue());
        System.out.println(str1.toString());

    }
}

enum Company{

    GOOGLE(100){
        @Override
        String getCurrence() {
            return "dollar";
        }

        @Override
        int getValue() {
            return super.getValue();
        }
    };
    int value;

    Company(int value){
        this.value = value;
    }

    int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Company{" +
                "value=" + value +
                '}';
    }

    abstract String getCurrence();
}