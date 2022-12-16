package chapter3;

public class TwoArrayAgain {
    public static void main(String[] args) {
        int b = 0;
        int[][] arr2 = new int[4][];
        arr2[0] = new int[1];
        arr2[1] = new int[2];
        arr2[2] = new int[3];
        arr2[3] = new int[4];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr2[i][j] = b;
                System.out.print(arr2[i][j] + " ");
                b++;
            }
            System.out.println();
        }
    }
}
