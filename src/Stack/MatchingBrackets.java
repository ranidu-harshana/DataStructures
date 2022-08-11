package Stack;

import java.util.Arrays;

public class MatchingBrackets {
    private char[] stack;
    private int top;
    String brackets_str;

    public MatchingBrackets () {
        top = 0;
        brackets_str = "";
    }

    public String check(String input) {

        this.brackets_str = input;

        this.stack = new char[brackets_str.length()];

        for (int i = 0; i < brackets_str.length(); i++) {
            char bracket = brackets_str.charAt(i);
            switch (bracket) {
                case '(':
                case '{':
                case '[':
                    push(bracket);
                    break;
                case ')':
                case '}':
                case ']':
                    if (!isEmpty()) {
                        char popped_bracket = pop();

                        if ((bracket == ')' && popped_bracket != '(') || (bracket == ']' && popped_bracket != '[') || (bracket == '}' && popped_bracket != '{')) {
                            return "NO";
                        }
                    } else {
                        return "NO";
                    }
                    break;
                default:
                    break;
            }

        }
        if (isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public void push(char bracket) {
        stack[top++] = bracket;
    }

    public char pop() {
        return stack[--top];
    }

    public char peek () {
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
