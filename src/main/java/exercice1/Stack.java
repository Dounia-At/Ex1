package exercice1;

import exercice1.LinkedList.Node;

public class Stack {
	
	private Node head;
    private int nodesCount;
 
    public Stack() {
        this.head = null;
        this.nodesCount = 0;
    }
	// Utility function to add an element `x` to the stack
    public void push(int x)        // insert at the beginning
    {
        // allocate a new node in a heap
        Node node = new Node();
 
        // check if stack (heap) is full. Then inserting an element would
        // lead to stack overflow
        if (node == null)
        {
            System.out.println("Heap Overflow");
            return;
        }
 
        System.out.println("Inserting " + x);
 
        // set data in the allocated node
        node.value = x;
 
        // set the .next pointer of the new node to point to the current
        // head node of the list
        node.next = head;
 
        // update head pointer
        head = node;
 
        // increase stack's size by 1
        this.nodesCount += 1;
    }
 
    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return head == null;
    }
 
    // Utility function to return the head element of the stack
    public int peek()
    {
        // check for an empty stack
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return head.value;
    }
 
    // Utility function to pop a head element from the stack
    public int pop()        // remove at the beginning
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
 
        // take note of the head node's data
        int head = peek();
 
        System.out.println("Removing " + head);
 
        // decrease stack's size by 1
        this.nodesCount -= 1;
 
        // update the head pointer to point to the next node
        this.head = (this.head).next;
 
        return head;
    }
    
 // Utility function to return the size of the stack
    public int size() {
        return this.nodesCount;
    }
}
