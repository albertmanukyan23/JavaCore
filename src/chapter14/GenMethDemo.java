package chapter14;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 8, 10, 65, 800, 56, 14};
        String[] str = {"one", "two", "tree", "four"};
        if (isIn(5, nums))
            System.out.println("is in");
        if (!isIn(5, nums))
            System.out.println("is not in");
        if (isIn("one", str))
            System.out.println("str is in");
        if (!isIn("two", str))
            System.out.println("str is not in");
        // if (isIn(8,str)
    }
}
