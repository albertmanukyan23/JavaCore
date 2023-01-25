package homework.homework9;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker1 = new BraceChecker("Java (is a) go[od programming(] lang}uage ");
        braceChecker1.check();
        BraceChecker braceChecker2 = new BraceChecker("}][}[]Java (is a) go[od programming] language ");
        braceChecker2.check();
        BraceChecker braceChecker3 = new BraceChecker("(Java (is a) go[od programming] language ");
        braceChecker3.check();


    }
}
