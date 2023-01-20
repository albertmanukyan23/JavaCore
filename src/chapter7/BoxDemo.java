package chapter7;

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(8, 5, 8.5);
        Box box4 = new Box(box1);
        System.out.println(box1.volume());
        System.out.println(box2.volume());
        System.out.println(box3.volume());
        System.out.println(box4.volume());
    }
}
