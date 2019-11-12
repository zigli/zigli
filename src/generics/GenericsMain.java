package generics;

public class GenericsMain {

    public static void main(String[] args) {

        Container<Integer> box = new Container<>(1);

        System.out.println(box.getObject1()*2);

        Container<String> box1 = new Container<>("1");

        System.out.println(box1.getObject1());
    }
}
