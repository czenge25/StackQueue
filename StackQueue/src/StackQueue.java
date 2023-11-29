public class StackQueue<T> {

    Stack s1;

    public StackQueue() {
        this.s1 = new Stack<>();
    }

    public void enqueue(T data) {
        s1.push(data);
        s1.size++;
        if (s1.size() == 1) {
            s2.push(data);
        } else {
            Stack temp = s1;
            for (int i = 0; i < s1.size() - 1; i++) {
                s2.push(temp.pop());
            }
        }

    }

}
