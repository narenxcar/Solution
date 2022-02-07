import java.util.*;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the sum range of natural numbers form 1 to ");
		int n=input.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
			System.out.println("The total sum of natural numbers is "+sum);
	}

}
