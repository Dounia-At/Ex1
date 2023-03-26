package exercice1;

import java.util.Scanner;

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
		
	}

}
