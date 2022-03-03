package task1;

public class Circle extends Shape {
    protected double radius;
    protected final double PI = 3.14;

    @Override
   protected double getArea(double radius) {
        return PI * radius * radius;
    }

    @Override
    protected double getPerimeter(double radius) {
        return 2 * PI * radius;
    }
}
