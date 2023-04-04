package LatihanModul3;

public class Stack {
    private int top;
    private Object[] elements;

    public Stack(int capacity) {
        elements = new Object[capacity];
        top = -1; }

    public void push(Object item) {
        if (top == elements.length - 1) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        elements[top] = item;
    }

    public Object pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        Object item = elements[top];
        top--;
        return item;
    }

    public Object peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[top];
    }

    public boolean empty() {
        return top == -1;
    }

    public int search(Object item) {
        for (int i = top; i >= 0; i--) {
            if (elements[i].equals(item)) {
                return top - i + 1;
            }
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next :" + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
