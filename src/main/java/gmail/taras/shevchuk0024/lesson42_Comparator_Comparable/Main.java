package gmail.taras.shevchuk0024.lesson42_Comparator_Comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> garage = new ArrayList<>();

        Car car1 = new Car(2016, 2.7);
        Car car2 = new Car(2008, 1.8);
        Car car3 = new Car(1997, 2.4);
        Car car4 = new Car(2023, 2.0);
        Car car5 = new Car(2003, 3.5);

        System.out.println("Compare car1 to car2: " + car1.compareTo(car2));
        System.out.println(" ");

        garage.add(car1);
        garage.add(car2);
        garage.add(car3);
        garage.add(car4);
        garage.add(car5);

        System.out.println("Before Sorting: " + garage);

        Collections.sort(garage);

        System.out.println("After Sorting: " + garage);
        System.out.println(" ");

        Set<Car> sortedByEngine = new TreeSet<>(Comparator.comparing(Car::getEngineCapacity));

        sortedByEngine.add(car1);
        sortedByEngine.add(car2);
        sortedByEngine.add(car3);
        sortedByEngine.add(car4);
        sortedByEngine.add(car5);

        System.out.println("Sorted by engine capacity: " + sortedByEngine);
    }
}
