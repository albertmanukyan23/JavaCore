package homework.homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final List<String> NAMES = new ArrayList<>();

    public static void main(String[] args) {
        NAMES.add("Armen");
        NAMES.add("Ashot");
        NAMES.add("Gayane");
        NAMES.add("Petros");
        NAMES.add("Sargis");
        System.out.println(NAMES);
        System.out.println("Testing add to list");
        addToList(NAMES);
        System.out.println(NAMES);
        System.out.println("Testing delete by name");
        deleteByName(NAMES);
        System.out.println(NAMES);
        System.out.println("Testing add name by index");
        addNameByIndex(NAMES);
        System.out.println(NAMES);
    }

    private static void deleteByName(List<? extends String> names) {
        System.out.println("Please input name");
        String name = SCANNER.nextLine();
        if (names.contains(name)) {
            names.remove(name);
            return;
        }
        System.out.println("Name doesn't exist");
    }

    private static void addToList(List<String> names) {
        System.out.println("Please input name");
        String s = SCANNER.nextLine();
        if (names.contains(s)) {
            System.err.println("The name already exists");
            return;
        }
        names.add(s);
        System.out.println("Name was added");
    }

    private static void addNameByIndex(List<String> names) {
        try {
            System.out.println("please input name");
            String name = SCANNER.nextLine();
            System.out.println("Please input index");
            int index = Integer.parseInt(SCANNER.nextLine());
            names.add(index, name);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Wrong index!");
        }
    }
}
