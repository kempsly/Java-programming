package priorityQueu;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCollection {
    public static void main(String[] args){
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(30);
        priorityQueue.add(150);
        priorityQueue.add(59);
        priorityQueue.add(40);
        if(!priorityQueue.isEmpty()){
            int head = priorityQueue.peek();
            System.out.println("Head Element : " + head);
            //Displaying the priority Queue
            System.out.println("Priority Queue : " + priorityQueue);
            // Removing an element
            int removeElement = priorityQueue.poll();
            System.out.println("Removed element : " + removeElement);
            System.out.println("Priority Queue : " + priorityQueue);
        }
        //Using a while loop
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

    }
}
