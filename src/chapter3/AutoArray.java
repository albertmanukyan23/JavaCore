package chapter3;

public class AutoArray {
    public static void main(String[] args) {
        int[] array = {2, 25, 36, 14, 31, 15};
        System.out.println(" Ապրիլը ունի " + array[4] + " ՕՐ ");

        double[] myarray = {10.5, 6.3, 25.2, 14.0};
        double result = 0;
        for (int i = 0; i < myarray.length; i++) {
            result = result + myarray[i];
        }
        System.out.println("Միջին թվաբանականը հավասար է " + result);

    }
}
