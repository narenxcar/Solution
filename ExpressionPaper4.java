import java.util.*;
public class ExpressionPaper4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of y ");
		int y=input.nextInt();
		int z=(++y*(y++ + 5));
		System.out.println("z=(++y *(y++ + 5)) Z= "+ z);
	}

}
