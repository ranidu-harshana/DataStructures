package Stack;

import java.util.EmptyStackException;

public class ArrayStack {
    private int[] backing_arr;
    private int top;

    public ArrayStack(int max_size) {
        backing_arr = new int[max_size];
    }
    public void push (int data) {
        if (top == backing_arr.length) {
            int[] new_arr = new int[backing_arr.length * 2];
            System.arraycopy(backing_arr, 0, new_arr, 0, backing_arr.length);
            backing_arr = new_arr;
        }

        backing_arr[top++] = data;
    }

    public int pop () {
        if (isEmpty()) {
            System.out.println("ERROR");
            throw new EmptyStackException();
        }

        return backing_arr[--top];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return backing_arr[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }


    public void display() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(backing_arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStack arrayStack =  new ArrayStack(2);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(4);
        arrayStack.push(6);

        arrayStack.display();
        arrayStack.pop();
        System.out.println('\n');
        arrayStack.display();
    }
}
