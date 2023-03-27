package exercice1;


public class LinkedList {
	Node head;
	
	public static class Node {
	    int value;

	    Node next;

	    Node(int d) {
	      value = d;
	      next = null;
	    }
	  }
	
	public void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
	public Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
