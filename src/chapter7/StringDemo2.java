package chapter7;

public class StringDemo2 {
    public static void main(String[] args) {
        String ob1 = "first";
        String ob2 = "line";
        String ob3 = ob2;
        System.out.println(ob1.charAt(1));
        System.out.println(ob1.length());

        if (ob1.equals(ob2)) {
            System.out.println("ob1 is equal to ob2");
        } else {
            System.out.println("ob1 is not equal to ob2");
        }
        if (ob2.equals(ob2)) {
            System.out.println("ob1 is equal to ob2");
        } else {
            System.out.println("ob1 is not equal to ob2");
        }
    }
}
