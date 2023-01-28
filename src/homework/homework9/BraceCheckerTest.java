package homework.homework9;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker1 = new BraceChecker("Java (is a) go[od programming(] lang}uage ");
        braceChecker1.check();
        BraceChecker braceChecker2 = new BraceChecker("}][}[]Java (is a) go[od programming] language ");
        braceChecker2.check();
        BraceChecker braceChecker3 = new BraceChecker("(Java (is a) go[od programming] language ");
        braceChecker3.check();
        BraceChecker braceChecker4 = new BraceChecker("([[[JAVA KOTL(I)N C++}}+] ");
        braceChecker4.check();
        BraceChecker braceChecker5 = new BraceChecker("+}}{]this is [a( te(]xt}");
        System.out.println(braceChecker1.replaceWrongBraces());
        System.out.println(braceChecker2.replaceWrongBraces());
        System.out.println(braceChecker3.replaceWrongBraces());
        System.out.println(braceChecker4.replaceWrongBraces());
        System.out.println(braceChecker5.replaceWrongBraces());

    }
}