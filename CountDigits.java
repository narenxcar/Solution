import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value to find number of Digits ");
		int n=input.nextInt();
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("The number Digits in integer is "+count);

	}

}
