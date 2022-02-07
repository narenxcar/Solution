import java.util.*;
public class GCD {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first value to find Greatest common divisor : ");
		int first=input.nextInt();
		System.out.print("\nEnter the Second value to find Greatest common divisor : ");
		int second=input.nextInt();
		int sum=1;
		int n=(first>second)?first:second;
		for(int i=n-1;i>1;i--) {
			if(first%i==0 && second%i==0) {
				sum*=i;
			}
			if(sum>1)break;
		}
		if(sum==1) {
			sum=first*second;
		}
		System.out.println("\n The Greatest common divisor of "+first+" & "+second+" is : "+sum);
	}

}
