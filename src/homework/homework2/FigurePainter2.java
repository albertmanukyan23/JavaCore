package homework.homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        /*
         *           * * * *
         *             * * *
         *               * *
         *                 *
         * */

        System.out.println("Figure 3");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Figure 4");

        /*
         *             *
         *            * *
         *           * * *
         *          * * * *
         *           * * *
         *            * *
         *             *
         *
         * */

        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
