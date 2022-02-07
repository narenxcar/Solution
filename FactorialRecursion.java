import java.util.Scanner;

public class FactorialRecursion {

	static int fact(int n) {
		if(n==1)return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value to find factorial ");
		int n=input.nextInt();
		System.out.println("The factorial of "+n+" is "+fact(n));
	}

}
