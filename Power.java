import java.util.*;
public class Power {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Base value : ");
		double b=input.nextDouble();
		System.out.print("\nEnter the Power value : ");
		double p=input.nextDouble();
		double c=Math.pow(b,p);
		System.out.println(b+" Power "+p+" is "+c);
	}

}
