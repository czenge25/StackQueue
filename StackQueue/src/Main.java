public class Main {
    public static void main(String[] args) {
        StackQueue<Integer> queue = new StackQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("What is last in the queue?: " + queue.peek());
        System.out.println("What is the size of the queue?: " + queue.size());
        System.out.println("Is the queue empty?: " + queue.isEmpty());

        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.dequeue()); // Output: 2

        System.out.println("What is the size of the queue?: " + queue.size());
        System.out.println("Is the queue empty?: " + queue.isEmpty());

        queue.enqueue(4);

        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4

        System.out.println("What is the size of the queue?: " + queue.size());
        System.out.println("Is the queue empty?: " + queue.isEmpty());

    }
}