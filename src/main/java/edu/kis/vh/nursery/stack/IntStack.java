package edu.kis.vh.nursery.stack;

public interface IntStack {

    int DEFAULT_VALUE = -1;


    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();



    int getTotal();
}
