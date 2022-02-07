import java.util.Scanner;

public class TernaryOperator {
		static int findmax(int x,int y) {
			return (x>y)?x:y;
		}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	      int x=input.nextInt();
	      int y=x - -x + +x + x+2;
	      System.out.println(findmax(x,y));

	}

}
