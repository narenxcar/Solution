import java.util.Scanner;

public class PolynomialEquation {

		public static void main(String[] args) {
			System.out.println("To find Polynomial Equation");
			System.out.println("Enter the value of a : ");
			double a=new Scanner(System.in).nextDouble();
			System.out.println("Enter the value of b : ");
			double b=new Scanner(System.in).nextDouble();
			System.out.println("Enter the value of c : ");
			double c=new Scanner(System.in).nextDouble();
			if(a==0) {
				System.out.println("Invalide input : ");
				System.exit(0);
			}
			double dis=(b*b)-(4*a*c);
			double real,imag;
			if(dis>=0) {
			double root1=((-b)+ Math.sqrt(dis))/2*a;
			double root2=((-b)- Math.sqrt(dis))/2*a;
			System.out.println("Root 1 is "+root1);
			System.out.println("Root 2 is "+root2);
			}else {
				real= -b/(2*a);
				imag=Math.sqrt(-dis)/(2*a);
				System.out.println("Root 1 is "+real +" + "+imag+"i");
				System.out.println("Root 2 is "+real +" - "+imag+"i");
			}
	}

}
