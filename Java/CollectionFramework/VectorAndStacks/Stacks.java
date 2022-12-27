package DSAlgo.CollectionFramework.VectorAndStacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(44);
        st.push(22);
        st.push(55);
        int popped = st.pop(); 
        System.out.println(popped);
        System.out.println(st.peek());

    }

}