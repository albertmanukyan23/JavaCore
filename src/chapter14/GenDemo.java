package chapter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> ob = new Gen<>(88);
        Integer ob1 = ob.getOb();
        System.out.println("value is equal to " + ob1);
        ob.showType();
        Gen<String> str = new Gen<>("albert");
        String str1 = str.getOb();
        System.out.println("value is equal to " + str1);
        str.showType();

    }
}
