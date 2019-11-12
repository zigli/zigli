package autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("add");

        int a = 44335;
        Integer b = Integer.valueOf(a);

        Integer c = 566;
        int y = c.intValue();

        System.out.println(b);

        String[] colors = {"yellow", "green", "blue"};
        LinkedList<String> ll = new LinkedList<>(Arrays.asList(colors));
        ll.add("red");
        ll.addFirst("black");

        ListIterator<String> listIterator = ll.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex() + " = " +listIterator.next());
        }

        colors = ll.toArray(new String[ll.size()]);

        System.out.println(Arrays.toString(colors));

        List lst = new LinkedList();
        lst.add("reewe");
        lst.add(1);

        for (Object o: lst){
            System.out.println(o);
        }

        for (int i = 0; i < lst.size(); i++){
            System.out.println(lst.get(i));
        }



    }
}
