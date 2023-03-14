package homework.homework12;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(5);
        st.push(4);
        st.push(1);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(50);
        System.out.println(st.pop());


    }
}
