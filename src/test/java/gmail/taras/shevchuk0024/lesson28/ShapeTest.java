package gmail.taras.shevchuk0024.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void shouldCalculateCircleArea() {
        // given
        Circle circle = new Circle(7);
        // when
        double area = circle.calculateArea();
        // then
        assertEquals(153.94, area, 0.01);
    }

    @Test
    void shouldCalculateCirclePerimeter() {
        // given
        Circle circle = new Circle(7);
        // when
        double perimeter = circle.calculatePerimeter();
        // then
        assertEquals(43.98, perimeter,0.01 );
    }
    @Test
    void shouldCalculateRectangleArea() {
        // given
        Rectangle rectangle = new Rectangle(8,12);
        // when
        double area = rectangle.calculateArea();
        // then
        assertEquals(96.0, area);
    }
    @Test
    void shouldCalculateRectanglePerimeter() {
        // given
        Rectangle rectangle = new Rectangle(8,12);
        //when
        double perimeter = rectangle.calculatePerimeter();
        // then
        assertEquals(40, perimeter);
    }
    @Test
    void shouldCalculateSquareArea() {
        // given
        Square square = new Square(6);
        // when
        double area = square.calculateArea();
        // then
        assertEquals(36.0,area);
    }
    @Test
    void shouldCalculateSquarePerimeter() {
        // given
        Square square = new Square(6);
        // when
        double perimeter = square.calculatePerimeter();
        // then
        assertEquals(24.0, perimeter);
    }
}