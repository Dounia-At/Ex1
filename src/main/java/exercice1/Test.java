package exercice1;

import java.util.Scanner;

import exercice1.LinkedList.Node;

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
        LinkedList linkedList = new LinkedList();

	    linkedList.head = new Node(1);
	    Node second = new Node(2);
	    Node third = new Node(3);

	    linkedList.head.next = second;
	    second.next = third;

	    System.out.print("LinkedList: ");
	    linkedList.printList(linkedList.head);
        System.out.println("\n");
        
        //test reversed linked list
        System.out.println("TEST REVERSE LINKED LIST");
	    System.out.println("Reversed linked list ");
	    linkedList.head = linkedList.reverse(linkedList.head);
        linkedList.printList(linkedList.head);
        
        System.out.println("\n");
        
        //test stack

        System.out.println("TEST STACK");
        Stack stack = new Stack();
		 
        stack.push(1);
        stack.push(2);
        stack.push(3);
 
        System.out.println("The top element is " + stack.peek());
 
        stack.pop();
        stack.pop();
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
        
        System.out.println("");
        
        }

}
