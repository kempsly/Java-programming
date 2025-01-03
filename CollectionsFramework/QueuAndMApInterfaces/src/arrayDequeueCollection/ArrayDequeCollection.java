package arrayDequeueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCollection {
    public static void main(String[] args){
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("First");
        arrayDeque.addLast("Second");
        arrayDeque.addLast("Third");
        arrayDeque.addLast("Fourth");

        System.out.println("Array Deque : " + arrayDeque);

        String removedFirst = arrayDeque.removeFirst();
        System.out.println("Removed First : " + removedFirst);

        String removedLast = arrayDeque.removeLast();
        System.out.println("Removed Last : " + removedLast);

        String peekFirst = arrayDeque.peekFirst();
        System.out.println("Peek First : " + peekFirst);
        System.out.println("Array Deque : " + arrayDeque);

        String lastPeek = arrayDeque.peekLast();

    }
}
