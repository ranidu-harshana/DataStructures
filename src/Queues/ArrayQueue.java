package Queues;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        back = 0;
    }

    public void enqueue(int data) {
        queue[back++] = data;
    }

    public int dequeue() {
        return queue[front++];
    }

    public void display () {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
