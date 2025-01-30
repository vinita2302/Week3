package Main.stack_queue.implement_queue_using_stacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();


        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);


        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.dequeue());  // Output: 2


        queue.enqueue(4);
        queue.enqueue(5);


        System.out.println(queue.dequeue());  // Output: 3
        System.out.println(queue.dequeue());  // Output: 4
        System.out.println(queue.dequeue());  // Output: 5


    }
}