/*import java.util.Arrays;

public class jp1 {
    private int maxSize;

    private int top;
    private int[] stackArray;

    public jp1(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Initialize the top pointer to -1 to indicate an empty stack
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a default value or throw an exception as needed
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a default value or throw an exception as needed
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        jp1 st = new jp1(5);

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("Stack contents: " + Arrays.toString(st.stackArray));
        System.out.println("Stack size: " + st.size());
        System.out.println("Top item: " + st.peek());

        int poppedItem = st.pop();
        System.out.println("Popped item: " + poppedItem);
        System.out.println("Stack contents after pop: " + Arrays.toString(st.stackArray));
        System.out.println("Is stack empty? " + st.isEmpty());
    }
}
