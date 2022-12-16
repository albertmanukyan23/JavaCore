package chapter3;

public class ThreeMatrix {
    public static void main(String[] args) {
        int[][][] arr3 = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {

                    arr3[i][j][k] = i * j * k;
                    System.out.print(arr3[i][j][k] + " ");
                }
                System.out.println();

            }
            System.out.println();

        }
    }
}
