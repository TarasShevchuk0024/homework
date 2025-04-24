package gmail.taras.shevchuk0024.lesson42_Comparator_Comparable;

public class Car implements Comparable<Car> {
    private int yearOfManufacture;
    private double engineCapacity;

    public Car(int yearOfManufacture, double engineCapacity) {
        this.yearOfManufacture = yearOfManufacture;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public int compareTo(Car otherCar) {
        int year = getYearOfManufacture();
        int otherYear = otherCar.getYearOfManufacture();

        int result;

        if (year < otherYear) {
            result = -1;
        } else {
            if (year == otherYear) {
                result = 0;
            } else {
                result = 1;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
