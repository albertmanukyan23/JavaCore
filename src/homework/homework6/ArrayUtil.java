package homework.homework6;

public class ArrayUtil {
    public void printArray(int[] array) {
        System.out.print("Elements:  ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max element: " + max);
    }

    public void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min element: " + min);
    }

    public void evenElements(int[] array) {
        System.out.print("Even Elements: ");
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                evenCount++;
            }
        }
        System.out.println("\nCount of even elements: " + evenCount);
    }

    public void oddElements(int[] array) {
        System.out.print("Odd Elements: ");
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
                oddCount++;
            }
        }
        System.out.println("\nCount of odd elements: " + oddCount);
    }

    public void arithmeticAverage(int[] array) {
        float value = 0;
        for (int i = 0; i < array.length; i++) {
            value += array[i];
        }
        float average = (value / array.length);
        System.out.println("Arithmetic average: " + average);

    }

    public void sumOfElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("The Sum of elements: " + sum);
    }

    public void firsElement(int[] array) {
        System.out.println("The First element: " + array[0]);
    }

    public void lastElement(int[] array) {
        System.out.println("The Last element: " + array[array.length - 1]);
    }

    public void theMiddleElements(int[] array) {
        int index = array.length / 2;
        int index1 = index - 1;
        if (array.length % 2 == 0) {
            System.out.println("The middle element:   " + array[index] + ", " + array[index1]);

        } else {

            System.out.println("The middle element: " + array[index]);
        }

    }
}
