package EstruturasDeDados;

public class Stack {
    private int top = -1;
    private int[] stack;

    public Stack(int capacity){
        this.top = -1;
        this.stack = new int[capacity];
    }
    public boolean isEmpty() {
        return this.top == -1;
    }
    public void push(int n){
        if (isFull()) throw new RuntimeException("FullStackExceptioin");

        this.top += 1;
        this.stack[top] = n;
    }

    public boolean isFull() {
        return this.top == this.stack.length-1;
    }

    public int peek(){
        if(isEmpty()) throw new RuntimeException("Pilha vazia");

        return stack[top];
    }

    public int size() {
        return this.top + 1;
    }

    public int pop(){
        if(isEmpty())throw new RuntimeException("Pilha vazia");

        return stack[this.top--];
    }
}