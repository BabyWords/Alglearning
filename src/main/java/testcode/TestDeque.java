package testcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
    public static void main(String[] args) {
        Deque<String> s = new ArrayDeque();
        s.addLast("1");
        s.addLast("2");
        s.addFirst("3");
        System.out.println(s.toString());
    }
}
