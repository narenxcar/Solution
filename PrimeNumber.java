import java.util.*;
public class PrimeNumber {
	static boolean prime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to check whether it's Prime Number or not : ");
		int number=input.nextInt();
		if(prime(number)) {
			System.out.println(number+" given number is prime number");
		}
		else {
			System.out.println(number+" given number is not a prime number");
		}

	}

}
