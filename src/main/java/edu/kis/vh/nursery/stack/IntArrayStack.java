package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStack {

    public static final int DEFAULT_VALUE = -1;
    public static final int EMPTY_MARKER = -1;
    public static final int NUMBERS_SIZE = 12;

    private final int[] numbers = new int[NUMBERS_SIZE];
    public int total = EMPTY_MARKER;

    public void push(int in)
    {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }


    public  boolean isEmpty() { return total == EMPTY_MARKER; }
    public boolean isFull() {
        return total == NUMBERS_SIZE-1;
    }


    public int getTotal() { return total +1;
    }


    public int top() {
        if (isEmpty()) {
            return DEFAULT_VALUE;
        }
        return numbers[total];
    }

    public int pop() {
        if (isEmpty()) {
            return DEFAULT_VALUE;
        }
        return numbers[total--];
    }




}
