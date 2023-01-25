package homework.homework9;

public class Stack {
    private char[] array = new char[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    private void extend() {
        char[] newArray = new char[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void push(char symbol) {
        if (tos == array.length - 1) {
            extend();
        }
        array[++tos] = symbol;
    }

    public char pop() {
        if (tos < 0) {
            return '+';
        }
        return array[tos--];
    }
}


