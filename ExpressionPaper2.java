import java.util.*;
public class ExpressionPaper2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a=input.nextInt();
		a+=a++ + ++a + --a + a--;//if(a=2)=== 2+=2 + 4 + 3 + 3===14
		System.out.println("Now the value of a is : "+a);

	}

}
