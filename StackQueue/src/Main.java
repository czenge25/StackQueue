/*
CZ
12/4/23
HK
 */
public class Main {
    public static void main(String[] args) {
        StackQueue<Integer> queue = new StackQueue<>();

        // Enqueue three elements (1, 2, and 3) into the queue.
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

// Print information about the current state of the queue.
        System.out.println("What is last in the queue?: " + queue.peek());
        System.out.println("What is the size of the queue?: " + queue.size());
        System.out.println("Is the queue empty?: " + queue.isEmpty());

// Dequeue two elements from the queue and print them. Expected output: 1, 2
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 2

// Print the updated size and emptiness status of the queue.
        System.out.println("What is the size of the queue?: " + queue.size());
        System.out.println("Is the queue empty?: " + queue.isEmpty());

// Enqueue a new element (4) into the queue.
        queue.enqueue(4);

// Dequeue the remaining elements from the queue and print them. Expected output: 3, 4
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4

// Print the final size and emptiness status of the queue.
        System.out.println("What is the size of the queue?: " + queue.size());
        System.out.println("Is the queue empty?: " + queue.isEmpty());


    }
}