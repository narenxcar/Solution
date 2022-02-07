import java.util.*;
public class BitwiseOperator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First value");
		int a=input.nextInt();
		System.out.println("Enter Second value");
		int b=input.nextInt();
		int c=a|b;
		System.out.println("Bitwise OR of = "+ c);
		c=a&b;
		System.out.println("Bitwise AND of = "+ c);
		c=a^b;
		System.out.println("Bitwise XOR of = "+ c);
	}

}
