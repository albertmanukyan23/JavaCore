package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 14, -9, 36, 12, 20, 50, 150};

        //Տպել մասիվի բոլոր էլեմենտները
        System.out.print("Մասիվի բոլոր էլեմենտներն են ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();

        //Տպել մասիվի ամենամեծ թիվը

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }
        }
        System.out.println("Մասիվի մեծագույն արժեքը հավասար է " + max);

        //Տպել մասիվի ամենափոքրը թիվը

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Մասիվի փոքրագույն  արժեքը հավասար է " + min);

        //Տպել մասիվի բոլոր զույգ էլեմենտները և դրանց քանակը
        System.out.print("Զույգ թվերն են ");
        int evenNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (evenNumber != 0) {
                    System.out.print(", " + array[i]);
                } else {
                    System.out.print(array[i]);
                }
                evenNumber++;
            }
        }
        System.out.println("\nԶույգ թվերի քանակը հավասար է " + evenNumber + "-ի");

        //Տպել մասիվի բոլոր կենտ էլեմենտները և դրանց քանակը

        System.out.print("Կենտ թվերն են ");
        int oddNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                if (oddNumber != 0) {
                    System.out.print(", " + array[i]);

                } else {
                    System.out.print(array[i]);
                }
                oddNumber++;

            }
        }
        System.out.println("\nԿենտ թվերի քանակը հավասար է " + oddNumber + "-ի");

        //Տպել մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)

        float value = 0;
        for (int i = 0; i < array.length; i++) {
            value += array[i];
        }
        float average = (value / array.length);
        System.out.println("բոլոր Էլեմենտների միջին թվաբանականը հավասար է " + average + "-ի");

        //Տպել մասիվի էլեմենտների գումարը։

        System.out.println("Մասիվի էլեմենտների գումարը հավասար է " + (int) value);

        //Տպել մասիվի առաջին էլեմենտը։
        System.out.println("Մասիվի առաջին էլեմենտն է " + array[0]);

        //Տպել մասիվի վերջին էլեմենտը։
        System.out.println("Մասիվի վերջին էլեմենտն է " + array[array.length - 1]);

        //Տպել մասիվի մեջտեղի էլեմենտը։
        int index = array.length / 2;
        int index1 = index - 1;
        if (array.length % 2 == 0) {
            System.out.println("Միջին էլեմենտներն են " + array[index] + " և " + array[index1]);

        } else {

            System.out.println("Միջին էլեմենտն է " + array[index]);
        }

    }
}
