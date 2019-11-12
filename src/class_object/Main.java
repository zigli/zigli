package class_object;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;


class One {
    public static int j = 90;
    One()
    { j = 12; }
}

public class Main{

    private static Boolean b1;
    private static boolean b2;
    private static Integer b3;
    private static int b4;

    public static void main(String[] args) {

        new Main();
        System.out.println(One.j);

        System.out.println("===================================");

        Main main = new Main();
        System.out.println(main.hashCode());
        System.out.println(main.getClass());

        Car car = new Car();
        System.out.println(car.hashCode());
        System.out.println(car.getClass());

        Car c1 = new Car();
        System.out.println(c1.hashCode());

        System.out.println(c1.toString());

        System.out.println("===================================");

        Point x = new Point(5, 5);
        Point y = new Point(5, 5);
        Point z = new Point(5, 5);

        System.out.println(x.equals(x)); //true     Рефлексивность

        System.out.println(x.equals(y)); //true     Симметричность
        System.out.println(y.equals(x)); //true     Симметричность

        System.out.println(x.equals(y)); //true     Транзитивность
        System.out.println(y.equals(z)); //true     Транзитивность
        System.out.println(x.equals(z)); //true     Транзитивность

        System.out.println(x.toString());
        System.out.println(x);

        System.out.println("===================================");

        Car car1 = new Car(2);
        Car car2 = new Car(2);
        Car car3 = car1;

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car1 == car2);
        System.out.println(car1 == car3);

        System.out.println("===================================");

        Car car11 = new Car(2);
        Car car22 = new Car(2);
        Car car33 = new Car(3);
        System.out.println(car11.hashCode());
        System.out.println(car22.hashCode());
        System.out.println(car33.hashCode());

        System.out.println("===================================");

        int t = 2;
        int u = 2;
        String a = "Hello";
        String b = "Hello";
        String aa = new String("Hello");
        String bb = new String("Hello");
        System.out.println(t == u);
        System.out.println(a == b);
        System.out.println(a == aa);
        System.out.println(b == bb);
        System.out.println(aa == bb);

        System.out.println("===================================");

        int w = 1;
        Integer ww = w;
        Integer www = Integer.valueOf(w);
        System.out.println(ww);
        System.out.println(www);

        System.out.println("===================================");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println("===================================");

        System.out.println( 0.3d == 0.1d + 0.1d + 0.1d );
        System.out.println( 0.1d + 0.1d + 0.1d );
        System.out.println( 0.1d + 0.1d + 0.1d );
        System.out.println( 0.3d );
        System.out.println( 0.4 == 0.2d + 0.2d );

        System.out.println("===================================");

        float f = 2.0f + 1.0f;
        f = f + 1;
        System.out.println( f );
        System.out.println( 0.0/0 );

        System.out.println("===================================");

        Boolean bbb = true;
        int i = 10;
        String str = "Hello World";
        assert (bbb == true) : "true";
        assert (i == 10) : "false Ошибка тут" ;
        System.out.println(str);

        System.out.println("===================================");

        Integer ir = new Integer("10");
        System.out.println(ir.toString());
        System.out.println(ir.toString());
        System.out.println(ir.toString() == ir.toString());
        System.out.println(ir.equals(ir));

        int qw = ir;
        int qw1 = ir;
        System.out.println(qw);
        System.out.println(qw1);
        System.out.println(qw==qw1);

        Car tt = new Car(3);
        System.out.println(tt.toString());
        System.out.println(tt.toString());
        System.out.println(tt.toString() == tt.toString());

    }

}


class Moto extends Car{
    static int nn;
    Moto(){
        super(nn);
    }
}


class Car {
    protected int i;

    Car() {

    }

    Car(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return i == car.i;
    }

}

class Point {
    private int a;
    private int b;

    Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
