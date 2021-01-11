package datastructure;

import java.util.Arrays;

class Stack {
    private int capacity;
    private int top;
    private int[] array;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = 0;
        this.array = new int[capacity];
    }

    public boolean push(int value) { //스택은 크기가 고정되어있다

        if(capacity>top){
            array[top++] = value;
        }
        return true;
    }

    public int pop() { // top만 감소시켜주면 구지빼주거나할필요없다
        if(top == 0) {
            return -1;
        }

        return array[--top];
    }

    public int peek() {
        if(top == 0) {
            return -1;
        }
        return array[top-1];
    }

    public boolean isEmpty() {

        return top ==0;
    }
}

class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println((stack.pop()));
        System.out.println((stack.pop()));

        System.out.println((stack.peek()));

        System.out.println((stack.pop()));
        System.out.println((stack.pop()));
        System.out.println((stack.pop()));
    }
}