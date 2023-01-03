package chapter5;

public class Search {
    public static void main(String[] args) {
        int[] array = {2, 7, 98, 36, 14, 45, 7, 6, 9, 36, 21};
        int value = 6;
        boolean found = false;
        for (int x : array) {
            if (x == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("number is found");
        }
    }
}

