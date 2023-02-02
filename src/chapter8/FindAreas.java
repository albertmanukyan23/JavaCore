package chapter8;

public class FindAreas {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 35);
        Triangle triangle = new Triangle(25, 100);
        Figure figure;
        figure = rectangle;
        System.out.println(figure.area());
        figure = triangle;
        System.out.println(figure.area());
    }
}
