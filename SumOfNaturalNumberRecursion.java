import java.util.*;
public class SumOfNaturalNumberRecursion {
	static int sumrecursion(int n) {
		if(n==1)return 1;
		else return n+sumrecursion(n-1);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the sum range of natural numbers form 1 to ");
		int n=input.nextInt();
		int sum=sumrecursion(n);
		System.out.println("The total sum of natural numbers is "+sum);
	}

}
