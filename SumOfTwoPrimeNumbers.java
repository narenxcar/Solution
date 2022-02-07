import java.util.*;
public class SumOfTwoPrimeNumbers {
	static boolean prime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the sum of two prime number : ");
		int a=input.nextInt();
		for(int i=2;i<a/2;i++) {
			if(prime(a-i) && prime (i)) {
				int f=a-i;
				System.out.println("The first prime number "+f+" second prime number is "+i+" sum of two prime number is "+a);
			}
		}

	}

}
