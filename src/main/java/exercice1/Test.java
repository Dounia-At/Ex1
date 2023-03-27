package exercice1;

import java.util.Scanner;

import exercice1.LinkedList.Node;

public class Test {

	public static void main(String[] args) {
		// test palindrome
		System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
       Palindrome p = new Palindrome();
        if(p.isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }     
		
        
        //test linked list
        LinkedList linkedList = new LinkedList();

	    linkedList.head = new Node(1);
	    Node second = new Node(2);
	    Node third = new Node(3);

	    linkedList.head.next = second;
	    second.next = third;

	    System.out.print("LinkedList: ");
	    linkedList.printList(linkedList.head);
        System.out.println("");
	    System.out.println("Reversed linked list ");
	    linkedList.head = linkedList.reverse(linkedList.head);
        linkedList.printList(linkedList.head);
	}

}
