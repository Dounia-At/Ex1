package exercice1;


public class LinkedList {
	Node head;
	
	public boolean isEmpty() {
        return head == null;
    }
	public void Add(Object data) {
        Node new_node = new Node(data); 
		Node last = head; 
		if (isEmpty()) { 
            head = new_node; 
        } 
        else { 
        while (last.next != null) { 
            last = last.next; 
        } 

        // Insert the new_node at last node 
        last.next = new_node; }
	}
	public void Remove() {
		this.reverse();
		if (isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
    
        // update the head pointer to point to the next node
        head = head.next;
        this.reverse();
	}
	public void printList()
    {
		Node node = head;
		while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
	
	
	public Node reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}
