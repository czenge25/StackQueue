/*
CZ
12/4/23
HK
 */
public class StackQueue<T> {

    Stack<T> s1;
    Stack<T> s2;

    public StackQueue() {
        // Constructor initializes two stacks, s1 and s2.
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void enqueue(T data) {
        // Enqueue operation: Push the data onto the first stack, s1.
        s1.push(data);
    }

    public T dequeue() {
        // Dequeue operation:
        // Transfer elements from s1 to s2 to reverse the order.
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // If s2 is still empty, the queue is empty.
        if (s2.isEmpty()) {
            throw new IllegalStateException();
        }
        // Pop the front element from s2.
        T data = s2.pop();
        // Transfer elements back to s1 to restore the original order.
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        // Return the dequeued data.
        return data;
    }

    public boolean isEmpty() {
        // Check if both stacks are empty to determine if the queue is empty.
        return s1.isEmpty() && s2.isEmpty();
    }

    public int size() {
        // Return the size of the first stack, which represents the queue's size.
        return s1.size();
    }

    public T peek() {
        // Peek operation:
        // Transfer elements from s1 to s2 to reverse the order.
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // If s2 is empty, the queue is empty.
        if (s2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        // Get the front element without removing it.
        T data = s2.peek();
        // Transfer elements back to s1 to restore the original order.
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        // Return the peeked data.
        return data;
    }

}