package homework.homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        // դասավորել աճման կարգով
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int value = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = value;
                }
            }
        }
        System.out.print("From min to max : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // դասավորել նվազման կարգով
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int value = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = value;
                }
            }
        }
        System.out.print("\nFrom max to min : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
