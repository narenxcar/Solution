import java.util.*;
public class Power {
	static double power(double x,int num) {
		double ans=1;
		int n=num;
		if(num<0) {
			n=-1 * n;
		}
		while(n>0) {
			if(n%2==0) {
				x=x*x;
				n=n/2;
			}else {
				ans=ans*x;
				n=n-1;
			}
		}
		if(num<0) {
			return  1.0/ans;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Base value : ");
		double b=input.nextDouble();
		System.out.print("\nEnter the Power value : ");
		int p=input.nextInt();
		double c=power(b,p);
		System.out.println(b+" Power "+p+" is "+c);
	}

}
