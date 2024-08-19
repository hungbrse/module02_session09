package ex2;

public class Circle extends Shape{
    private double radius;

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
