package homework.homework11;

import chapter9.IFTest;

import java.util.*;

public class CollectionExample2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Testing nameSort() method");
        List<String> sortedNames = nameSort();
        if (sortedNames == null) {
            System.err.println("Wrong Count of names");
        } else System.out.println(sortedNames);

        System.out.println("Testing getUniqueNames()");
        Set<String> uniqueNames = getUniqueNames();
        if (uniqueNames == null) {
            System.err.println("Wrong Count of names");
        } else System.out.println(uniqueNames);
    }

    //Անունները կարող են կրկնվել, դրա համար օգտագորժել եմ Arraylist, հակառակ դեպքում կօգտագործեի TreeSet
    private static List<String> nameSort() {
        System.out.println("Please input 10 names");
        String str = SCANNER.nextLine();
        String[] strArray = str.split(",");
        if (strArray.length != 10) {
            return null;
        }
        List<String> sortedNames = new ArrayList<>(Arrays.asList(strArray));
        Collections.sort(sortedNames);
        return sortedNames;
    }

    private static Set<String> getUniqueNames() {
        System.out.println("Please input 5 names");
        String str = SCANNER.nextLine();
        String[] strArray = str.split(",");
        if (strArray.length != 5) {
            return null;
        }
        Set<String> names = new HashSet<>(Arrays.asList(strArray));
        return names;
    }
}
