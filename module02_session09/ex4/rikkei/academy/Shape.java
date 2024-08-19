package rikkei.academy;

public abstract class Shape {

    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea() ;
    public void display() {
        System.out.println("Color: " + color);
    }
}
