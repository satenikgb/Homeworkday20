package task1;

public class Square extends Shape{
    @Override
    protected double getPerimeter(double side) {
        return 4*side;
    }

    @Override
    protected double getArea(double side) {
        return side*side;
    }
}
