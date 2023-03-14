package homework.homework12;

import java.util.LinkedList;
import java.util.Queue;

public class Stack<T> {
    //Implement the Stack methods using only two Queue objects
    private Queue<T> elementsByInputOrder;
    private Queue<T> tmpQueue;

    public Stack() {
        elementsByInputOrder = new LinkedList<T>();
        tmpQueue = new LinkedList<T>();
    }

    public void push(T element) {
        elementsByInputOrder.offer(element);
    }

    public T pop() {
        if (elementsByInputOrder.isEmpty()) {
            return null;
        }
        int size = elementsByInputOrder.size();
        for (int i = 0; i < size - 1; i++) {
            tmpQueue.offer(elementsByInputOrder.poll());
        }
        T queue = elementsByInputOrder.poll();
        elementsByInputOrder = tmpQueue;
        return queue;
    }

    public T peek() {
        if (elementsByInputOrder.isEmpty()) {
            return null;
        }
        return elementsByInputOrder.peek();
    }

    public boolean isEmpty() {
        return elementsByInputOrder.isEmpty();
    }

    public int size() {
        return elementsByInputOrder.size();
    }

}
