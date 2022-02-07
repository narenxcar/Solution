import java.util.*;
public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value ");
		int a=input.nextInt();
		System.out.println("Enter the divisible value ");
		int b=input.nextInt();
		System.out.println("The Quotient is "+ a/b);
		System.out.println("The Remainder is "+ a%b);
	}

}
