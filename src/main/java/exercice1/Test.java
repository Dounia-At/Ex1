package exercice1;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// test palindrome
		System.out.println("TEST PALINDROME");
		System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
       Palindrome p = new Palindrome();
        if(p.isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }     
		
        System.out.println("");
        
        //test linked list
        System.out.println("TEST LINKED LIST");
        System.out.println("__________________________");
        LinkedList linkedList = new LinkedList();

	    linkedList.Add(1);
	    linkedList.Add(2);
	    linkedList.Add(5);
	    linkedList.Remove();
	    linkedList.Add(3);
	    

	    System.out.print("Linked List : ");
	    linkedList.printList();
        System.out.println("\n");
        
        
        
        //test reversed linked list
        System.out.println("TEST REVERSE LINKED LIST");
        System.out.println("__________________________");
	    System.out.print("Reversed linked list : ");
	    linkedList.head = linkedList.reverse();
        linkedList.printList();
        
        System.out.println("\n");
        
        //test stack

        System.out.println("TEST STACK");
        System.out.println("__________________________");
        Stack stack = new Stack();
		 
        stack.push(1);
        stack.push(2);
        stack.push(3);
 
        System.out.println("The top element is " + stack.peek());
 
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.print("The stack is not empty : ");
            stack.print();
        }
        
        System.out.println("\n");
        
        //test queue
        System.out.println("TEST QUEUE");
        System.out.println("__________________________");
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Queue Front : " + ((q.list.head != null) ? (q.list.head).value : -1));
        System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).value : -1));
        
        System.out.println("\n");
        
        //test queue
        System.out.println("TEST Expression");
        System.out.println("__________________________");
        
        String expr = "[()]{}{[()()]()}";
        if (new StringExp().isBalanced(expr))
            System.out.println(expr +" is Balanced ");
        else
            System.out.println(expr + " is Not Balanced ");
        
        expr = "[(])";                
        if (new StringExp().isBalanced(expr))
            System.out.println(expr +" is Balanced ");
        else
            System.out.println(expr + " is Not Balanced ");
	}

}
