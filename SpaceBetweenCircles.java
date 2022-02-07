import java.util.*;
public class SpaceBetweenCircles {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
	       System.out.println("Enter the radius of outer circle");
	       double outer_circle=input.nextDouble();
	       System.out.println("Enter the radius of inner circle");
	       double inner_circle=input.nextDouble();
	       double area_difference=(3.14*(outer_circle*outer_circle))-(3.14*(inner_circle*inner_circle));
	        System.out.println("Area of difference between two circles "+ area_difference );

	}

}
