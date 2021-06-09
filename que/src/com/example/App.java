package com.example;

public class App {
	public static void main (String[] args)
    {
       
        Myqueue q = new Myqueue(5);
 
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
 
        System.out.println("The front element is " + q.peek());
        q.equeue();
        System.out.println("The front element is " + q.peek());
 
        System.out.println("The queue size is " + q.size());
 
        q.equeue();
        q.equeue();
 
        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }

}