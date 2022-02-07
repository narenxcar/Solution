import java.util.*;
public class Factorial {
	static int fact(int n) {
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value to find factorial ");
		int n=input.nextInt();
		System.out.println("The factorial of "+n+" is "+fact(n));
	}

}
