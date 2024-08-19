package ex2;

import java.awt.*;

public class Square extends Shape implements  Colorable {

    double side;
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}
