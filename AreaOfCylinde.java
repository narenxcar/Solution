import java.util.*;
public class AreaOfCylinde {

		public static void main(String[] args){
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter the radius of Cylinder ");
	        double radius=input.nextDouble();
	        System.out.println("Enter the height of Cylinder ");
	        double height=input.nextDouble();
	        double area=(2*3.14*(radius*height))+2*(3.14*(radius*radius));
	        System.out.println("Area of Cylinder : "+ area );
	    }

	}
