package ex2;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(3.5),
                new Rectangle(4.0,5.2),
                new Square(4.0),
        };



        for (Shape shape : shapes) {

            System.out.println("Area" + shape.getArea());

            if (shape instanceof  Colorable) {
                ((Colorable) shape).howToColor();
            }
        }




    }
}
