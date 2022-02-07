import java.util.*;
public class AreaOfSquare {
	static int areasquare(int area) {
		return area*area;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value ");
		int area=input.nextInt();
		System.out.println("Area of Square : "+ areasquare(area));

	}

}
