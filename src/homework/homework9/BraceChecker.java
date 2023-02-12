package homework.homework9;

public class BraceChecker {
    private String text;
    private final Stack symbolCase = new Stack();


    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        // Stack դատարկ լինելու դեպքում pop()-ը վերադարձնում է '+';
        char last;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    symbolCase.push(text.charAt(i));
                    break;
                case ')':
                    last = symbolCase.pop();
                    if (last == '+') {
                        System.err.println("Your Brace ) at " + i + " does not have opened pair");
                        break;
                    }
                    if (last != '(') {
                        System.err.println("Error: opened " + last + " but closed ) at " + i);
                    }
                    break;
                case ']':
                    last = symbolCase.pop();
                    if (last == '+') {
                        System.err.println("Your Brace ] at " + i + " does not have opened pair ");
                        break;
                    }
                    if (last != '[') {
                        System.err.println("Error: opened " + last + " but closed ] at " + i);
                    }
                    break;
                case '}':
                    last = symbolCase.pop();
                    if (last == '+') {
                        System.err.println("Your Brace } at " + i + " does not have opened pair");
                        break;
                    }
                    if (last != '{') {
                        System.err.println("Error: opened " + last + " but closed } at " + i);
                    }
                    break;
            }
        }
        // բացված բայց չփակված փակագծերի համար
        while ((last = symbolCase.pop()) != '+') {
            System.err.println("Error: opened" + last + " but didn't close");
        }
    }

    public String replaceWrongBraces() {
        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder(text);
        // Stack դատարկ լինելու դեպքում pop()-ը վերադարձնում է '+';
        for (int i = 0; i < sb.length(); i++) {
            switch (sb.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(sb.charAt(i));
                    break;
                case ')':
                    char firstType = stack.pop();
                    if (firstType == '+') {
                        sb.deleteCharAt(i);
                        i--;
                        break;
                    }
                    if (firstType == '[') {
                        sb.setCharAt(i, ']');
                        break;
                    }
                    if (firstType == '{') {
                        sb.setCharAt(i, '}');
                        ;
                    }
                    break;
                case ']':
                    char secondType = stack.pop();
                    if (secondType == '+') {
                        sb.deleteCharAt(i);
                        i--;
                        break;
                    }
                    if (secondType == '{') {
                        sb.setCharAt(i, '}');
                        break;
                    }
                    if (secondType == '(') {
                        sb.setCharAt(i, ')');
                    }
                    break;
                case '}':
                    char thirdType = stack.pop();
                    if (thirdType == '+') {
                        sb.deleteCharAt(i);
                        i--;
                        break;
                    }
                    if (thirdType == '[') {
                        sb.setCharAt(i, ']');
                        break;
                    }
                    if (thirdType == '(') {
                        sb.setCharAt(i, ')');
                    }
                    break;
            }
        }
        boolean stackIsEmpty = false;
        while (!stackIsEmpty) {
            switch (stack.pop()) {
                case '+':
                    stackIsEmpty = true;
                    break;
                case '(':
                    sb.append(')');
                    break;
                case '[':
                    sb.append(']');
                    break;
                case '{':
                    sb.append('}');
            }
        }
        return sb.toString();
    }
}
