package generics;

class MyGenerics<T1 ,T2>{
    public T1 var1;
    public T2 var2;

    /** tttt */
    public MyGenerics(T1 var1, T2 var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
}


public class Main1 {

    public static void main(String[] args) {

        MyGenerics<Integer,String> instance = new MyGenerics<>(1,"Test");
        System.out.println(instance.var1 + instance.var2);
    }
}
