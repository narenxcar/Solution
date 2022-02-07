import java.util.*;
public class ExpressionOfPaper {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Enter value of a");
		int a=input.nextInt();
		System.out.println("Enter value of b");
		int b=input.nextInt();
		int c=++a - b--;
		System.out.println("i)   a= "+a+" b= "+b+"    Solution ++a-b– : "+ c );
		c=a % b++;
		System.out.println("ii)  a= "+a+" b= "+b+"    Solution a%b++ :" + c);
		c=(a*=b+5);
		System.out.println("iii) a= "+a+" b= "+b+"    Solution a*=b+5 :"+ c);
		int x=69>>>2;
		System.out.println("iv)  x=69>>>2 :"+x);
	}

}
