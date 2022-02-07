import java.util.*;
public class BinaryToOctal {
	static int power(int n) {
		if(n==0)return 1;
		return 2*power(n-1);
	}
		static int decimal(String a) {
			int n=a.length();
			int sum=0,i=0,j=n-1;
			while(i<n) {
				if(a.charAt(i)=='1') {
					sum+=1*power(j);
				}
				i++;
				j--;
			}
			return sum;
		}
		static int octal(int a) {
			int sum=0;
			int i=1;
			while(a>0) {
				int r=a%8;
				sum=sum+(r*i);
				a=a/8;
				i*=10;
			}
			return sum;
		}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the binary value to convert octal : ");
		String binary=input.nextLine();
		int integer=decimal(binary);
		System.out.print("Binary "+binary+" to octal "+octal(integer));//
	}

}
