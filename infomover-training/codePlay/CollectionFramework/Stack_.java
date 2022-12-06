package com.imt.training.java.codePlay.CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(12);
        st.push(33);
        st.push(45);
        st.push(42);

        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
