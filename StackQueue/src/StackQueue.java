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
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        if (s2.isEmpty()) {
            throw new IllegalStateException();
        }
        T data = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return data;
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
