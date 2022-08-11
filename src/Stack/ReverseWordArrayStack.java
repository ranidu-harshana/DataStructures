package Stack;

public class ReverseWordArrayStack {
    private char[] stack;
    private int top;
    private String word;
    private String reversed_word = "";

    public String reverse(String word) {
        this.word = word;
        this.stack = new char[word.length()];

        for (int i = 0; i < stack.length; i++) {
            push(word.charAt(i));
        }

        while (!isEmpty()) {
            this.reversed_word += pop();
        }

        return this.reversed_word;
    }

    public void push(char word) {
        stack[top++] = word;
    }

    public char pop () {
        return stack[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
