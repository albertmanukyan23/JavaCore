package chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }
        System.out.println();
        System.out.println(Apple.valueOf("GoldenDel"));
        System.out.flush();
    }
}
