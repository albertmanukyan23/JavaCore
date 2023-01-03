package chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("number = " + i);
                    break;
                default:
                    System.out.println("number > " + 3);

            }
        }
    }
}
