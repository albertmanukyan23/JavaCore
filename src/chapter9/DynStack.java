package chapter9;

public class DynStack implements IntStack {
    private int stack[];
    private int tos;

    public DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2];
            // удвоить размер стека
            for (int i = 0; i < stack.length; i++) temp[i] = stack[i];
            stack = temp;
        }
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
