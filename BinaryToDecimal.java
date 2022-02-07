import java.util.*;
public class BinaryToDecimal {
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
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter the binary value : ");
		String binary=input.nextLine();
		System.out.print(binary+" is converted to decimal : "+decimal(binary));
	}

}
