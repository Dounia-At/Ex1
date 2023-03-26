package exercice1;

public class Palindrome {
	public boolean isPalindrome(int number) {
		int reverse = 0;
		int palindrome = number;
		
		while(palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome /= 10;
		}
		if(number == reverse)	return true;
		return false;
	}
}
