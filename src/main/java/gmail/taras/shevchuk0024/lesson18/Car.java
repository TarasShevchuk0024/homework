package gmail.taras.shevchuk0024.lesson18;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Car {
    private double fuelLevel;
    private double fuelConsumption;
    private LocalDate nextTuev;

    public Car(double fuelLevel, double fuelConsumption, LocalDate nextTuev) {
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
        this.nextTuev = nextTuev;
    }
    public boolean canDrive() {
        return fuelLevel > 0;
    }

    public boolean isAllowedToDrive() {
        return LocalDate.now().isBefore(nextTuev) || LocalDate.now().isEqual(nextTuev);
    }
    public double getMaxDistance() {
        if (fuelConsumption > 0) {
            return (fuelLevel / fuelConsumption) * 100;
        }
        return 0;
    }
}
