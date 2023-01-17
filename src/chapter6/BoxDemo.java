package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(25,85,96);
        double vol = box.volume();
        System.out.println(vol);
    }
}
