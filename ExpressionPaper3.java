import java.util.*;
public class ExpressionPaper3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=input.nextInt();
		x=x++ * 2 + 3 * -x; 
		System.out.println("x=x++ * 2 + 3 * --x : "+ x);//if (x=5)-> x= 5 * 2 + 3 * 5 === 25// 
	}

}
