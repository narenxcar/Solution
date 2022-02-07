import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to check Palindrome Number or not :");
		int n=input.nextInt();
		int count=0;
		int temp=n;
		while(n>0) {
			int r=n%10;
			count=(count*10)+r;
			n=n/10;
		}
		if(temp==count) {
			System.out.println(temp+" The given numbe is Palindrome Number");
		}else
		{
			System.out.println(temp+" The given numbe is not a Palindrome Number");
		}
	}
}
