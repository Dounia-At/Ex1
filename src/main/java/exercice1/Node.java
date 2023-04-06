package exercice1;


public class Node<T> {
	T value;

    Node next;
    
    Node() {
	    }
    Node(T d) {
      value = d;
      next = null;
    }
}
