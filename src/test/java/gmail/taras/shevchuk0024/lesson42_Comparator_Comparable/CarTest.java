package gmail.taras.shevchuk0024.lesson42_Comparator_Comparable;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Collections.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void shouldSortCarsByYearOfManufactureWhenUsingComparable() {
        // given
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2016, 2.7));
        cars.add(new Car(2008, 1.8));
        cars.add(new Car(1997, 2.4));
        cars.add(new Car(2023, 2.0));
        cars.add(new Car(2003, 3.5));

        // when
        Collections.sort(cars);

        // then
        assertEquals(1997, cars.get(0).getYearOfManufacture());
        assertEquals(2003, cars.get(1).getYearOfManufacture());
        assertEquals(2008, cars.get(2).getYearOfManufacture());
        assertEquals(2016, cars.get(3).getYearOfManufacture());
        assertEquals(2023, cars.get(4).getYearOfManufacture());
    }

    @Test
    void shouldSortCarsByEngineCapacityWhenUsingComparatorTreeSet() {
        // given
        Set<Car> cars = new TreeSet<>((car1, car2) -> Double.compare(car1.getEngineCapacity(), car2.getEngineCapacity()));
        cars.add(new Car(2016, 2.7));
        cars.add(new Car(2008, 1.8));
        cars.add(new Car(1997, 2.4));
        cars.add(new Car(2023, 2.0));
        cars.add(new Car(2003, 3.5));

        // when
        List<Car> sortedCars = new ArrayList<>(cars);

        // then
        assertEquals(1.8, sortedCars.get(0).getEngineCapacity());
        assertEquals(2.0, sortedCars.get(1).getEngineCapacity());
        assertEquals(2.4, sortedCars.get(2).getEngineCapacity());
        assertEquals(2.7, sortedCars.get(3).getEngineCapacity());
        assertEquals(3.5, sortedCars.get(4).getEngineCapacity());
    }

}