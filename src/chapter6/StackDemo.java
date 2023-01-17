package chapter6;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(25);
        myStack.push(25);
        myStack.push(25);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.pop());
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
    }
}
