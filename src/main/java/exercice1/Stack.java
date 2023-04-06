package exercice1;


public class Stack {
	
	private LinkedList list;
    private int nodesCount;
 
    public Stack() {
    	this.list = new LinkedList();
        this.list.head = null;
        this.nodesCount = 0;
    }
	// Utility function to add an element `x` to the stack
    public void push(Object x)        // insert at the beginning
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
        list.reverse();
        list.Add(x);
        list.reverse();
        // increase stack's size by 1
        this.nodesCount += 1;
    }
 
    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return list.head == null;
    }
 
    // Utility function to return the head element of the stack
    public Object peek()
    {
        // check for an empty stack
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return list.head.value;
    }
 
    // Utility function to pop a head element from the stack
    public Object pop()        // remove at the beginning
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
 
        // take note of the head node's data
        Object head = peek();
 
        System.out.println("Removing " + head);
 
        // decrease stack's size by 1
        this.nodesCount -= 1;
        
        // update the head pointer to point to the next node
        list.reverse();
        list.Remove();
        list.reverse();
        return head;
    }
    
 // Utility function to return the size of the stack
    public int size() {
        return this.nodesCount;
    }
    public void print() {
        list.printList();
    }
}
