package rikkei.academy;

public class Main {
    public static void main(String[] args) {


        Shape circle = new Circle("red",4.7);
        System.out.println(circle.color);
        System.out.println(circle.getArea());


        Shape rectangle = new Rectangle("red",4.7,5.5);

        System.out.println(rectangle.color);
        System.out.println(rectangle.getArea());
    }
}
