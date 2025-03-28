package gmail.taras.shevchuk0024.lesson28;

public class Shape {
    public double calculateArea() {
        System.out.println("Площа не визначена для абстрактної фігури. ");
        return 0;
    }
    public void displayInfo() {
        System.out.println("Це абстрактна геометрична фігура. ");
    }
    public double calculatePerimeter() {
        System.out.println("Неможливо визначити периметр для абстрактної фігури");
        return 0;
    }
}
