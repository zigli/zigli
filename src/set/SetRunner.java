package set;

import java.util.*;

public class SetRunner {

    public static void main(String[] args) {
/*

        String[] cars = {"Mini", "Mersedes-Benz","Audi","VW","Smart","Toyota","Porsche"};
        String[] otherCars = {"Audi", "Ford", "GMC" , "Toyota", "Chevrolet"};

        Set<String> carSet = new HashSet<>(Arrays.asList(cars));

        Set<String> otherCarSet = new HashSet<>(Arrays.asList(otherCars));

        Set<String> uniqueCars = new HashSet<>(carSet);
        uniqueCars.addAll(otherCarSet);

        print(uniqueCars);


        String[] cars1 = {"Mini", "Mersedes-Benz","Audi","VW","Smart","Toyota","Porsche"};
        String[] otherCars1 = {"Audi", "Ford", "GMC" , "Toyota", "Chevrolet"};

        Set<String> carSet1 = new LinkedHashSet<>(Arrays.asList(cars1));

        Set<String> otherCarSet1 = new LinkedHashSet<>(Arrays.asList(otherCars1));

        Set<String> uniqueCars1 = new LinkedHashSet<>(carSet1);
        uniqueCars1.addAll(otherCarSet1);

        print(uniqueCars1);

        String[] cars2 = {"Mini", "Mersedes-Benz","Audi","VW","Smart","Toyota","Porsche"};
        String[] otherCars2 = {"Audi", "Ford", "GMC" , "Toyota", "Chevrolet"};

        Set<String> carSet2 = new TreeSet<>(Arrays.asList(cars2));

        Set<String> otherCarSet2 = new TreeSet<>(Arrays.asList(otherCars2));

        Set<String> uniqueCars2 = new TreeSet<>(carSet2);
        uniqueCars2.addAll(otherCarSet2);

        print(uniqueCars2);

*/

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf", 45));
        sixCars.add(new Car("Audi", "A3", 60));
        sixCars.add(new Car("VW", "Polo", 35));
        sixCars.add(new Car("BMW", "Z4", 120));
        sixCars.add(new Car("BMW", "440i", 200));


        Set<Car> europaCars = new HashSet<>();
        europaCars.add(new Car("Toyota", "Auris", 40));
        europaCars.add(new Car("Reno", "Clio", 30));
        europaCars.add(new Car("Reno", "Megan", 50));
        europaCars.add(new Car("VW", "Golf", 45));
        europaCars.add(new Car("VW", "Polo", 35));

        Set<Car> uniqueCars = new HashSet<>(sixCars);
        uniqueCars.addAll(europaCars);
        printCars(uniqueCars);

        Set<Car> uniqueCarsTree = new TreeSet<>(Collections.reverseOrder());
        uniqueCarsTree.addAll(sixCars);
        uniqueCarsTree.addAll(europaCars);
        printCars(uniqueCarsTree);

        NavigableSet<Car> uniqueCarsTreeNav = new TreeSet<>(sixCars);
        uniqueCarsTreeNav.addAll(europaCars);
        SortedSet<Car> carsHead = uniqueCarsTreeNav.headSet(new Car("Toyota", "Auris", 40));
        printCars(carsHead);
        SortedSet<Car> carsTail = uniqueCarsTreeNav.tailSet(new Car("Toyota", "Auris", 40));
        printCars(carsTail);
        SortedSet<Car> carsSubSet = uniqueCarsTreeNav.subSet(new Car("Toyota", "Auris", 40),new Car("Audi","A3",60));
        printCars(carsSubSet);
        SortedSet<Car> carsSubSet1 = uniqueCarsTreeNav.subSet(new Car("Toyota", "Auris", 40),true,new Car("Audi","A3",60),true);
        printCars(carsSubSet1);

        System.out.println("=====================================================");
        Car car1 = new Car("Toyota", "Auris", 40);
        System.out.println("Higher of (" + car1 + "): " + uniqueCarsTreeNav.higher(car1));
        Car car2 = new Car("Toyota", "Auris", 40);
        System.out.println("Lower of (" + car2+ "): " + uniqueCarsTreeNav.lower(car2));
        Car car3 = new Car("Toyota", "Auris", 43);
        System.out.println("Ceil of (" + car3 + "): " + uniqueCarsTreeNav.lower(car3));
        Car car4 = new Car("Toyota", "Auris", 39);
        System.out.println("Floor of (" + car4 + "): " + uniqueCarsTreeNav.lower(car4));


    }

    private static void printCars(Set<Car> cars){
        System.out.println("=======================================================");
        System.out.printf("%-20s %-20s %-20s\n", "Car brand", "Model", "Price per day");
        System.out.println("=======================================================");
        for(Car car: cars){
            System.out.printf("%-20s %-20s %-20s\n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }

    private static void print(Set<String> cars){
        System.out.println(cars);
    }


}
