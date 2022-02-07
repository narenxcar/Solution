import java.util.*;
public class ExpressionPaper5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of X ");
		int x=input.nextInt();
		int x1=++x - x++ + -x;
		System.out.println("x1=++x - x++ + -x  x1= "+ x1);

	}

}
