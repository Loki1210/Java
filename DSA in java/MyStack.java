import java.util.ArrayList;

class MyStack<T> { //Generic implementation with ArrayList
    private ArrayList<T> stackList;

    public MyStack() {
        stackList = new ArrayList<>();
    }

    public void push(T data) {
        stackList.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // Or throw an exception
        }
        return stackList.remove(stackList.size() - 1); //Removes from the end.
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // Or throw an exception
        }
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Apple");
        myStack.push("Banana");
        myStack.push("Cherry");
        myStack.push("Yarab");

        System.out.println("Stack size: " + myStack.size());
        System.out.println("Top element: " + myStack.peek());

        while (!myStack.isEmpty()) {
            System.out.println("Popped: " + myStack.pop());
        }
    }
}
