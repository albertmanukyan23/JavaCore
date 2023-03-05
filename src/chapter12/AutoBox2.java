package chapter12;

public class AutoBox2 {
    static int m(Integer a) {
        return a;
    }
    public static void main(String[] args) {
        Integer ob = m(10);
        System.out.println(ob);

    }
}
