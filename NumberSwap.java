import java.util.*;
public class NumberSwap {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first value :");
		int a=input.nextInt();
		System.out.println("Enter the second vlaue : ");
		int b=input.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("first value swape to second value");
		System.out.println("Now first value is "+ a+" second value is "+b);
	}

}
