package rikkei.academy;

public class Circle extends Shape{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
