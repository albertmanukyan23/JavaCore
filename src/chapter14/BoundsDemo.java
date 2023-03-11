package chapter14;

import java.util.Iterator;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] Inums = {20, 10, 15, 85};
        Stats<Integer> nums = new Stats<>(Inums);
        double w = nums.average();
        System.out.println(w);
        Double[] Idoub = {14.5, 40.7, 40.9, 140.14};
        Stats<Double> num = new Stats<>(Idoub);
        double A = num.average();
        System.out.println(A);
    }
}
