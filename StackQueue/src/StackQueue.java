public class StackQueue<T> {

    Stack<T> s1;
    Stack<T> s2;

    public StackQueue() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public void enqueue(T data) {
        s1.push(data);
    }

    public T dequeue(){
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            } else {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
        }
        return s2.pop();
    }

    public boolean isEmpty() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return s1.size;
    }

}
