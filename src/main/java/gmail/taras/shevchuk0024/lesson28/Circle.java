package gmail.taras.shevchuk0024.lesson28;

public class Circle extends Shape {
    private double radius;

    public Circle( double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: Коло");
        System.out.println("Радіус: " + radius);
        System.out.println("Площа: " + calculateArea());
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
