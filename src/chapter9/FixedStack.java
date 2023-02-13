package chapter9;

public class FixedStack implements IntStack {
    private int[] stack;
    private int tos = -1;

    public FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stack.length - 1) // использовать поле длины стека
            System.out.println("Cтeк заполнен.");
        else
            stack[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return stack[tos--];
    }
}

