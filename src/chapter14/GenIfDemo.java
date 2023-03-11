package chapter14;

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[] nums = {8, 9, 10, 5};
        Character[] characters = {'d','f','f','e'};
        MyClass<Integer> mc = new MyClass<>(nums);
        System.out.println(mc.max());
        System.out.println(mc.min());
        MyClass<Character> mc1 = new MyClass<>(characters);
        System.out.println(mc1.max());
        System.out.println(mc1.min());

    }
}
