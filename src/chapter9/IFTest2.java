package chapter9;

public class IFTest2 {
    public static void main(String[] args) {
        FixedStack fs = new FixedStack(8);
        DynStack ds = new DynStack(5);
        IntStack myStack;
        myStack = ds;
        for (int i = 0; i < 5; i++) myStack.push(i);
        myStack = fs;
        for (int i = 0; i < 8; i++) myStack.push(i);
        myStack = ds;
        System.out.println("Знaчeния в динамическом стеке:");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack.pop());
        myStack = fs;
        for(int i=0; i<8; i++)
            System.out.println(myStack.pop());

    }
}
