package bai11.th2;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Dequeued item is " + queue.dequeue().key);
        }
    }
}
