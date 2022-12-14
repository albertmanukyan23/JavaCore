package chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean a;
        a = true;
        System.out.println("a= " + a);
        a = false;
        System.out.println("a= " + a);
        if (a) {
            System.out.println("Այս կոդը մենք չենք տեսնի");
        }
        a = true;
        if (a) {
            System.out.println("Այս կոդը կտեսնենք");
        }
        System.out.println("10>8" + (10 > 8));

    }
}
