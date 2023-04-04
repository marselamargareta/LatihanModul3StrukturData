package LatihanModul3;

public class QueueMain {

    private int maxSize;
    private Object[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueMain(int size) {
        maxSize = size;
        queueArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(Object value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public Object remove() {
        Object temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public Object peek() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public static void main(String[] args) {
        QueueMain queue = new QueueMain(4);
        queue.insert("Java");
        queue.insert("DotNet");
        queue.insert("PHP");
        queue.insert("HTML");

        System.out.println("remove : " + queue.remove());
        System.out.println("peek : " + queue.peek());
        System.out.println("remove : " + queue.remove());
        System.out.println("peek : " + queue.peek());
    }
}