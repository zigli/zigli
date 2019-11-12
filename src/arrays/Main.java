package arrays;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arr = {66,3,24,6,9};
        System.out.println(Arrays.toString(arr));
        System.out.println("Search 24");
        System.out.println(Arrays.binarySearch(arr,24));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Search 24");
        System.out.println(Arrays.binarySearch(arr,24));


        System.out.println("=================================");

        Integer[] arr2 = {66,3,24,6,9};
        System.out.println(Arrays.toString(arr2));
        System.out.println("Search 24");
        System.out.println(Arrays.binarySearch(arr2,24));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("Search 24");
        System.out.println(Arrays.binarySearch(arr2,24));
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
        System.out.println("Search 24");
        System.out.println(Arrays.binarySearch(arr2,4));


        System.out.println("=================================");

        ArrayList list = new ArrayList();
        list.add(0,3);
        list.add(1,"fdd");

        System.out.println(list.toString());
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.toString());
        System.out.println(list.size());

        System.out.println("=================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(0,"reeee");
        list1.add(1,"fdd");


        list1.set(1,"fsdfwewg");

        System.out.println(list1.toString());
        System.out.println(list1.size());
        list1.remove(1);
        System.out.println(list1.toString());
        System.out.println(list1.size());

        list1.add("fdd");
        list1.add("reredd");
        list1.add("dseedd");
        System.out.println(list1.toString());
        System.out.println(list1.size());

        Iterator<String> stringIterator = list1.iterator();

        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        ListIterator<String> stringListIterator = list1.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.nextIndex());
            System.out.println(stringListIterator.next());
        }

        System.out.println("=================================");

        String str = "Test2";
        String str1 = "Test1";

        boolean boo = true;
        int t = 0;
        while(boo){
            System.out.println(t);
            if(t==10) break;
            if (t==2) return;
            t++;
        }

    }

}
