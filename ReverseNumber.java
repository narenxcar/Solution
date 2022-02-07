import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to Reverse Number");
		int n=input.nextInt();
		int count=0;
		while(n>0) {
			int r=n%10;
			count=(count*10)+r;
			n=n/10;
		}
		System.out.println("The Reverse Number is "+count);

	}

}
