import java.util.*;
public class UnaryOperator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	      int x=input.nextInt();
	      int y=x - -x + +x + x+2;
	      System.out.println(y);
	      System.out.println(!(x>y));
	}

}
