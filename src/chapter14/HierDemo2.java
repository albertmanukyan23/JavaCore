package chapter14;

import java.util.ArrayList;
import java.util.List;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen3<String> S = new Gen3<>(5,"hello");
        System.out.println(S.getNums());
        System.out.println(S.getT());
        List<?> list = new ArrayList<Integer>();

    }
}
