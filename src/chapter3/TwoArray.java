package chapter3;

public class TwoArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                arr[i][j] = a;
                System.out.print(arr[i][j] + " ");
                a++;
            }
            System.out.println();

        }

    }
}
