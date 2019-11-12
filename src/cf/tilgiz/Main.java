package cf.tilgiz;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Formatter;

class MyClass {
    public static class Nested {
        public void method() {
            System.out.println("Nested class");
        }

        public static void staticMethod() {
            System.out.println("Nested class");
        }

    }
}


public class Main {

    public static void main(String[] args) {

        MyClass.Nested vv = new MyClass.Nested();
        vv.method();
        vv.staticMethod();

        MyClass.Nested.staticMethod();

        System.out.println();
        System.out.println("===========================================");

        Boolean b1 = new Boolean("/true");
        System.out.println(b1);

        System.out.println();
        System.out.println("===========================================");


        /*Bicycle bicycle = new Bicycle("Toyota", 30,52);
        Bicycle.SteeringWheel wheel = bicycle.new SteeringWheel();
        Bicycle.Seat seat = bicycle.new Seat();

        seat.up();
        seat.down();
        bicycle.start();
        wheel.left();
        wheel.right();

        seat.getSeatParam();*/

        System.out.println(2.0 % 0);
        System.out.println(0.0 % 0);
        System.out.println(2.0 / 0);
        System.out.println(0.0 / 0);
        System.out.println(Math.sqrt(-1));

        System.out.println();
        System.out.println("===========================================");

        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }

        System.out.println();
        System.out.println("===========================================");

        String x = "Java";
        String concat = x.concat(" Rules!");
        System.out.println(x);
        System.out.println(concat);
        String s = x.toUpperCase();
        System.out.println(s);
        String replace = x.replace('a', 'X');
        System.out.println(replace);

        System.out.println();
        System.out.println("===========================================");

        A a = new B();
        a.m(34);
        a.mA(55);

        B b = new B();
        b.m(34);
        b.mA(55);
        b.mB(55);

        A c = (A) b;
        c.m(34);
        c.mA(55);

        A d = new A();
        d.m(34);
        d.mA(55);

        System.out.println();
        System.out.println("===========================================");

        System.out.printf("%6.4f", Math.PI);
        System.out.println();
        System.out.printf("%6d", 22644546);
        System.out.println();
        System.out.printf("Number 1 %2$d %1$d", 22644546, 4551);


        System.out.println();
        System.out.println("===========================================");

        String tt = "2";
        int k = Integer.parseInt(tt);
        System.out.println(k);

        System.out.println();
        System.out.println("===========================================");

        int x1 = 2;
        for (x1 = 3; x1 < 5; x1++) ;
        System.out.println("x1 = " + x1);

        System.out.println();
        System.out.println("===========================================");

        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println((int) c1);
        System.out.println((int) c2);
        System.out.println((int) c3);
        System.out.println(c1 + c3);

        System.out.println();
        System.out.println("===========================================");

        final int iii = 127;
        byte j = 0;
        j = (byte) iii;
        System.out.println(j);

        System.out.println();
        System.out.println("===========================================");

        int aa = 5;
        System.out.println(aa++);
        int aaa = 5;
        System.out.println(++aaa);

        System.out.println();
        System.out.println("===========================================");


        byte operand = 0b0000001;
        System.out.println(" " + operand);

        System.out.println();
        System.out.println("===========================================");

        String str = "left";
        char c4 = str.charAt(0);
        System.out.println(c4);

        System.out.println();
        System.out.println("===========================================");

        toBinary(6478);

        System.out.println();
        System.out.println("===========================================");

        System.out.println(calc(8, 22));

        System.out.println();
        System.out.println("===========================================");

        char[] ch = new char[1];
        System.out.println(ch[0]);
        System.out.println((int) ch[0]);

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1[0]));

        System.out.println((int) ((Math.random() * 10) - 5));

        System.out.println();
        System.out.println("===========================================");

        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);
        System.out.println(i1 == 10);

        System.out.println();
        System.out.println("===========================================");

        String s1 = "10";
        String s2 = "10";
        System.out.println(s1 == s2);
        System.out.println(s1 == "10");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        s1 += "1";
        s2 += "1";
        System.out.println(s1 == s2);
        System.out.println(s1 == "10");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("===========================================");

        String aq = "" + 1 + '+' + 1 + '=' + 1 + 1 + " is ";
        String aq1 = "" + 1 + '+' + 1 + '=' + (1 + 1) + " is ";
        System.out.println(aq);
        System.out.println(aq1);

        System.out.println("===========================================");

        int xx = 1;
        Integer yy = new Integer(xx);
        int[] zz = {xx};

        func(xx, yy, zz);

        System.out.println(xx);
        System.out.println(yy);
        System.out.println(zz);

        System.out.println("===========================================");

        Integer i22 = new Integer("10");
        System.out.println(i22.toString().intern());
        if (i22.toString().intern() == i22.toString().intern()) {
            System.out.println("Равный");
        } else {
            System.out.println("Неравный");
        }

        System.out.println("===========================================");

        try {
            int a5 = 0;
            int b5 = 42 / a5;
            System.out.println("A");
        } catch (ArithmeticException e) {
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("C");
        }

        System.out.println("===========================================");

        Integer I1 = 0;
        Integer I2 = -1;
        Integer I3 = 1;
        Formatter f = new Formatter();
        f.format("%1$b ", I1.toString()).format("%1$b ", I2.toString()).format("%1$b ", I3.toString());
        //f.format("%1$b ", I1.toString()).format("%1$b ", I2.toString());
        f.format("%1$b ", I1);
        System.out.println(f);

        System.out.println("===========================================");

        short rr = 7;
        System.out.println(new Alien().invade(rr));
        System.out.println((-7 % 5) > (7 % -5));
        System.out.println((-7 % -5));
        System.out.println((7 % -5));


        int a2 = 10;
        int b2 = 100;
        double c22 = (double) a2 / b2;
        System.out.println(c22);

        String str222 = String.format("%1.4f", c22);
        System.out.println(str222);


        String d1 = "beekeeper";
        String d2 = d1.substring(1, 7);
        System.out.println(d2);
        d1 = "w" + d2;
        System.out.println(d1);

        //Boolean bb = new Boolean("true");
        boolean bb = false;
        System.out.println(bb + " == false > " + (bb == false));
        System.out.println(bb + " == true > " + (bb == true));
        System.out.println(bb + " = false > " + (bb = false));
        bb = false;
        System.out.println(bb + " = true > " + (bb = true));

        int[] myValue = {1};
        modifyIt(myValue);
        System.out.println("myValue contains " + myValue[0]);

        Holder h = new Holder();
        h.held = 100;
        h.bump(h);
        System.out.println(h.held);

        System.out.println("===========================================");

/*
        String str1 = "abc";
        final String str22 = "ab";
        final String str3 = "c";
        String str4 = str22 + str3;
        System.out.print("Before using intern function: ");    System.out.println(str1 == str4);
        str4 = str4.intern();
        System.out.print("After using intern function: ");
        System.out.println(str1 == str4);
*/

        String str4 = "socialmedia";

        String str1 = "social";
        String str2 = "media";
        String str3 = str1 + str2;
        System.out.println(str3 == str4); // false

        final String str11 = "social";
        final String str21 = "media";
        String str31 = str11 + str21;
        System.out.println(str31 == str4); // true

    }

    public static void modifyIt(int[] value) {
        value[0]++;
    }

    static void func(int x, Integer y, int[] z) {
        x++;
        y++;
        z[0]++;
    }


    static int calc(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return calc(b, a % b);
    }


    static void toBinary(int a) {

        int temp = a % 2;
        int temp1 = a / 2;
        if (temp1 >= 2) {
            toBinary(temp1);
        }
        System.out.print(temp);
    }

    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

}

class Holder {
    public int held;

    public void bump(Holder theHolder) {
        theHolder.held++;
    }
}

class Alien {
    String invade(short ship) {
        return "a few";
    }

    String invade(short... ships) {
        return "many";
    }
}


class A {
    public void m(int k) {
        System.out.println("class A, method m:" + ++k);
    }

    public void mA(int k) {
        System.out.println("class A, method mA:" + ++k);
    }
}

class B extends A {
    public void m(int k) {
        System.out.println("class B, method m:" + k++);
    }

    public void mB(int k) {
        System.out.println("class B, method mB:" + k++);
    }
}


