package com.example;

public class Myqueue {
	private int[] arr;      
    private int front;      
    private int rear;       
    private int capacity;    
    private int count;      
    
    Myqueue(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    public void equeue()
    {

        if (isEmpty())
        {
            System.out.println("Underflow Program Terminated");
            System.exit(1);
        }
 
        System.out.println("Removing " + arr[front]);
 
        front = (front + 1) % capacity;
        count--;
    }
 
    public void enqueue(int item)
    {
       
        if (isFull())
        {
            System.out.println("Overflow  Program Terminated");
            System.exit(1);
        }
 
        System.out.println("Inserting " + item);
 
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\n Program Terminated");
            System.exit(1);
        }
        return arr[front];
    }
    public int size() {
        return count;
    }
    public Boolean isEmpty() {
        return (size() == 0);
    }
    public Boolean isFull() {
        return (size() == capacity);
    }
	

}