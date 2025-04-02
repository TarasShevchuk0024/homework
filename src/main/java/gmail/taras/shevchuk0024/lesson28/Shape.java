package gmail.taras.shevchuk0024.lesson28;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    void displayInfo() {
        System.out.println("Це абстрактна геометрична фігура");
    }
}
