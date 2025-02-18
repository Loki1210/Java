import java.util.ArrayList;

class MyQueue<T> {
    private ArrayList<T> queueList;

    public MyQueue() {
        queueList = new ArrayList<>();
    }

    public void enqueue(T data) {
        queueList.add(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queueList.remove(0); // Remove from the front (index 0)
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queueList.get(0); // Get the element at the front (index 0)
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public int size() {
        return queueList.size();
    }

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.enqueue("Alice");
        myQueue.enqueue("Bob");
        myQueue.enqueue("Charlie");

        System.out.println("Queue size: " + myQueue.size());
        System.out.println("Front element: " + myQueue.peek());

        while (!myQueue.isEmpty()) {
            System.out.println("Dequeued: " + myQueue.dequeue());
        }
    }
}
