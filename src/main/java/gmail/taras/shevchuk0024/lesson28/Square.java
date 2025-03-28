package gmail.taras.shevchuk0024.lesson28;

public class Square extends Rectangle {
    private double side;

    public Square (double side) {
        super(side,side);
        this.side = side;
    }

    @Override
    public void displayInfo() {
        System.out.println("Фігура: Квадрат");
        System.out.println("Сторона " + side);
        System.out.println("Площа " + calculateArea());
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
