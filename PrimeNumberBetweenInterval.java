import java.util.*;
public class PrimeNumberBetweenInterval {
	static boolean prime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Begining value to find prime number range : ");
		int a=input.nextInt();
		System.out.print("Enter the Ending value to find prime number range : ");
		int b=input.nextInt();
		System.out.println("The prime numbers are");
		for(int i=a;i<=b;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
