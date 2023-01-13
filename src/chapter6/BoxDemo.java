package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        box.depth = 100;
        box.width = 25;
        box.height = 14;
        Box box1 = new Box();
        box1.width = 78;
        box1.depth = 98;
        box1.height = 45;
        box1.volume();
        box.volume();

    }
}
