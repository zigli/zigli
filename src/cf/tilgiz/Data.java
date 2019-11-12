package cf.tilgiz;

public class Data {

    Data() {
        System.out.println("default constructor");
    }

    Data(int i) {
        this();
        System.out.println("int parameter "+i+" constructor");

    }

    Data(String s) {
        this(10);
        System.out.println("string parameter "+s+" constructor");

    }

    public static void main(String[] args) {
        Data d = new Data(20);
        System.out.println("------");
        Data d1 = new Data("Hi");
    }

}

