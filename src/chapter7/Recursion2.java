package chapter7;

public class Recursion2 {
    public static void main(String[] args) {
        RecTest rt = new RecTest(10);
        for (int i = 0; i < rt.array.length; i++) {
            rt.array[i]=i;
        }
        rt.printArray(10);
    }
}
