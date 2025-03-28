package gmail.taras.shevchuk0024.lesson28;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(8,12);
        Square square = new Square(6);
        System.out.println(" ");

        circle.displayInfo();
        System.out.println("Периметр: " + circle.calculatePerimeter());

        System.out.println(" ");

        rectangle.displayInfo();
        System.out.println("Периметр: " + rectangle.calculatePerimeter());

        System.out.println(" ");

        square.displayInfo();
        System.out.println("Периметр: " + square.calculatePerimeter());

    }
}
