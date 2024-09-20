package home.Assign;

public class Palindrome {

	public static void main(String[] args) {
		int n=1003001;
		int rev=0;		
		int temp=n;
		while(temp>0) {
			int remainder=temp%10;
			rev=(rev*10)+remainder;
			temp=temp/10;
		}
		if(n==rev)
			System.out.println(" The given number is Palindrome");
		else
		System.out.println("The given number is not a Palindrome");

		}
			
		}
		
		
		
		