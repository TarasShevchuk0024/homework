package gmail.taras.shevchuk0024.lesson18;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(60, 9.7, LocalDate.of(2026, 8, 24));
        System.out.println(myCar);
        System.out.println("Машина може їхати: " + myCar.canDrive());
        System.out.println("Машина допущена до експлуатації: " + myCar.isAllowedToDrive());
        System.out.println("Машина може проїхати: " + myCar.getMaxDistance() + " km");
    }
}
