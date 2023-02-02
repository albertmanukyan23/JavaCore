package chapter8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol = myBox1.volume();
        System.out.println(vol);
        vol = myBox2.volume();
        System.out.println(vol);
    }
}
