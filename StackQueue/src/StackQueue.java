public class StackQueue<T> {

    Stack s1;
    Stack s2;

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
    public T dequeue(){
        T data;
        if(s1.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }else {
            data = (T)s2.peek();
            s2.pop();
            s2.size--;
            Stack temp = s2;
            s1= new Stack();
            for(int i =0; i< s2.size; i++){
                s1.push(temp.pop());
            }
        }
        return data;
    }

}
