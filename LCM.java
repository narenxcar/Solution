import java.util.*;
public class LCM {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first element to find LCM : ");
		int a=input.nextInt();
		System.out.print("Enter the second element to find LCM : ");
		int b=input.nextInt();
		int n=(a>b)?a:b;
		int sum=1;
		for(int i=2;i<n;i++) {
			if(a%i==0 && b%i==0) {
				sum=i;
			}
			if(sum>1)break;
		}
		if(sum==1) {
			sum=a*b;
		}
		System.out.print("The LCM of "+a+" & "+b+" is : ");
		System.out.print(sum);
	}

}
