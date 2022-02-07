import java.util.*;
public class OctalToDecimal {
	static int power(int n) {
		if(n==0)return 1;
		return 8*power(n-1);
	}
	static int decimal(int a) {
		int digit=0,sum=0;
		while(a>0) {
			int r=a%10;
			sum=sum+(r*power(digit));
			digit++;
			a=a/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter the octal value : ");
		int octal=input.nextInt();
		System.out.print(octal+" is converted to decimal : "+decimal(octal));

	}

}
