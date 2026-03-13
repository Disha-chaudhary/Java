package Java.Stack;
class stack {
    int maxSize;
    int[] stackArray;
    int top;

    
    stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if stack is empty
    boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    boolean isFull() {
        return (top == maxSize - 1);
    }

    // Display stack elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        stack s = new stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped element: " + s.pop());

        System.out.println("Stack elements:");
        s.display();
    }
}