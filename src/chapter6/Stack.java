package chapter6;

public class Stack {
    int[] array = new int[10];
    int tos;

    public Stack() {
        tos = -1;
    }

    void push(int number) {
        if (tos == 9) {
            System.out.println("Array is full ");
            return;
        }
        array[++tos] = number;
    }

    public int pop() {
        if (tos == -1){
            System.out.println("Array is empty ");
            return -1;
        }
        return array[tos--];
    }

}
