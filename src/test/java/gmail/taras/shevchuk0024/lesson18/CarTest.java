package gmail.taras.shevchuk0024.lesson18;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void shouldReturnTrueWhenCarCanDrive() {
        // given
        Car car = new Car(10, 8, LocalDate.of(2026, 8, 24));
        // when
        boolean result = car.canDrive();
        // then
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseWhenCarCannotDrive() {
        // given
       Car car = new Car(0,8, LocalDate.of(2026, 8, 24));
        // when
       boolean result = car.canDrive();
        // then
       assertFalse(result);
    }
    @Test
    void shouldReturnTrueWhenCarIsAllowedToDrive(){
        //given
        Car car = new Car(10, 8, LocalDate.now().plusDays(1));
        //when
        boolean result = car.isAllowedToDrive();
        //then
        assertTrue(result);
    }
    @Test
    void shouldReturnFalseWhenCarIsAllowedToDrive(){
        //given
        Car car = new Car(10, 8, LocalDate.now().minusDays(1));
        //when
        boolean result = car.isAllowedToDrive();
        //then
        assertFalse(result);
    }
    @Test
    void shouldCalculateMaxDistanceCorrectly(){
        //given
        Car car = new Car(50, 10, LocalDate.of(2026, 8, 24));
        //when
        double maxDistance = car.getMaxDistance();
        //then
        assertEquals(500, maxDistance);
    }
    @Test
    void shouldReturnZeroMaxDistanceWhenFuelConsumptionIsZero(){
        //given
        Car car = new Car(50,0,LocalDate.of(2026,8,24));
        //when
        double maxDistance = car.getMaxDistance();
        //then
        assertEquals(0, maxDistance);
    }

}