package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 14, -9, 36, 12, 20, 50, 150};

        //Տպել մասիվի բոլոր էլեմենտները
        System.out.print("Մասիվի բոլոր էլեմենտներն են ");
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");

        }
        System.out.println();

        //Տպել մասիվի ամենամեծ թիվը

        int max = -2000000000;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }
        }
        System.out.println("Մասիվի մեծագույն արժեքը հավասար է " + max);

        //Տպել մասիվի ամենափոքրը թիվը

        int min = 2000000000;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Մասիվի փոքրագույն  արժեքը հավասար է " + min);


    }
}
