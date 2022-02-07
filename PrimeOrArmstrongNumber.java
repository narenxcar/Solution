import java.util.*;
public class PrimeOrArmstrongNumber {
	static boolean prime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	static boolean armstrong(int n) {
		int a=n,r,sum=0;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(a==sum)return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number check whether it is Prime or Armstrong number : ");
		int num=input.nextInt();
		if(prime(num)&&armstrong(num))System.out.println(num+" The number are both Prime and Armstrong Number");
		else if(prime(num))System.out.println(num+" The number are Prime Number");
		else if(armstrong(num))System.out.println(num+" The number are Armstrong Number");
		else System.out.println(num+" The number are not Prime and Armstrong Number");
	}

}
