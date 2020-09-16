package Homework.week01;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class DequeTest {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public  static void main(String[] args) {
        //Stack
        Deque<String> deque= new LinkedList<String>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);
        String str =deque.peekFirst();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size()>0){
            System.out.println(deque.removeFirst());
        }
        System.out.println(deque);

        //Queue
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        System.out.println(deque);

        String peek = deque.peekFirst();
        System.out.println(peek);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pollFirst());
        }

    }
}
