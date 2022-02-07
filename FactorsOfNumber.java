import java.util.*;
public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter value to find all factors : ");
		int a=input.nextInt();
		System.out.print(a+" Factor are : ");
		for(int i=1;i<=a;i++) {
			if(a%i==0)System.out.print(i+" ");
		}
	}

}
