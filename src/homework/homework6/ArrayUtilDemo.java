package homework.homework6;

import java.util.Arrays;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        ArrayUtil au = new ArrayUtil();
        au.printArray(array);
        au.maxOfArray(array);
        au.minOfArray(array);
        au.evenElements(array);
        au.oddElements(array);
        au.theMiddleElements(array);
        au.lastElement(array);
        au.firsElement(array);
        au.sumOfElements(array);
        au.arithmeticAverage(array);

    }
}
