import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value to find Fibonacci squence :");
		int n=input.nextInt();
		int a=1,b=1;
		System.out.print(a+" "+b);
		int c;
		for(int i=2;i<n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
