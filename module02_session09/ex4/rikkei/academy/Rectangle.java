package rikkei.academy;

public class Rectangle extends  Shape{

    private double width;
    private double height;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
