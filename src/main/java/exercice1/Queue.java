package exercice1;


public class Queue {
	LinkedList list;
	Node rear;
	 
    public Queue() { 
    	this.list = new LinkedList();
    	this.list.head = this.rear = null; 
    	}
 
    // Method to add an key to the queue.
    void enqueue(Object key)
    {
 
        // Create a new LL node
        Node temp = new Node(key);
        System.out.println("Inserting " + key);
        // If queue is empty, then new node is front and
        // rear both
        if (this.rear == null) {
            this.list.head = this.rear = temp;
            return;
        }
        
        // Add the new node at the end of queue and change
        // rear
        list.Add(key);
        this.rear = temp;
    }
 
    // Method to remove an key from queue.
    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.list.head == null)
            return;
 
        // Store previous front and move front one node
        // ahead
        System.out.println("Removing " + this.list.head.value);
        Node temp = this.list.head;
        this.list.head = this.list.head.next;
 
        // If front becomes NULL, then change rear also as
        // NULL
        if (this.list.head == null)
            this.rear = null;
    }
}
