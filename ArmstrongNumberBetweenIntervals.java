import java.util.*;
public class ArmstrongNumberBetweenIntervals {
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
		System.out.print("Enter starting range : ");
		int a=input.nextInt();
		System.out.print("Enter ending range : ");
		int b=input.nextInt();
		System.out.println("Armstrong numbers are");
		for(int i=a;i<=b;i++) {
			if(armstrong(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
