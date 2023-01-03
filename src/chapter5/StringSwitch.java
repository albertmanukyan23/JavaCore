package chapter5;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "one";
        switch (str) {
            case "two":
                System.out.println("two");
                break;
            case "one":
                System.out.println("one");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("It is not correct");
        }
    }
}
