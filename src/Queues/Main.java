package Queues;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(11);

        arrayQueue.display();

        System.out.println('\n');

        System.out.println(arrayQueue.dequeue());

        System.out.println('\n');
        arrayQueue.display();

    }
}
