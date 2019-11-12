package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMethod {


    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 4};
        Double[] doubleArray = {0.233, 0.544, 0.53, 3.544};
        String[] stringArray = {"ade", "rer", "ter3", "wewe"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println(findMax(intArray));
        System.out.println(findMax(doubleArray));
//        System.out.println(findMax(stringArray));

        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> integerList = Arrays.asList(intArray);
        List<Double> doubleList = Arrays.asList(doubleArray);

        printElements(list);
        printElements(integerList);
        printElements(doubleList);


        MyBox<Integer> myBox = new MyBox<Integer>("df");

        Double aDouble = MyBox.returnValue(0.05);
        System.out.println(aDouble);

    }

    private static <T> void printArray(T[] intArray) {
        System.out.println("Generic method call");
        for (T elem : intArray) {
            System.out.printf("%s, ", elem);
        }
        System.out.println();

    }
    private static void printArray(Integer[] intArray) {
        System.out.println("Non generic method call");
        for (Integer elem : intArray) {
            System.out.printf("%s, ", elem);
        }
        System.out.println();

    }

    private static <T extends Number & Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T e : array) {
            if (e.compareTo(max) > 0) max = e;
        }
        return max;
    }

    private static void printElements(List<? extends Number> list){
        for (Number n: list){
            System.out.println(n);
        }
    }
}
