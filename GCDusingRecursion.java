import java.util.*;
public class GCDusingRecursion {
	static int gcd(int a,int b,int n) {
		if(a%n==0 && b%n==0)return n;
	return gcd(a,b,n-1);
}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first value to find Greatest common divisor : ");
		int first=input.nextInt();
		System.out.print("\nEnter the Second value to find Greatest common divisor : ");
		int second=input.nextInt();
		int n=(first>second)?first:second;
		System.out.print("\n The Greatest common divisor of "+first+" & "+second+" is : ");
		int sum=gcd(first,second,n-1);
		if(sum==1) {
			sum=first*second;
		}
		System.out.print(sum);
	}

}
