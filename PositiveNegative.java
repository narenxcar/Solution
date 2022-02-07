import java.util.*;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to check it's positive or negathive");
		int number=input.nextInt();
		if(number>0)System.out.println(number+" Given number is Positive");
		else if(number==0)System.out.println(number+" Given number is Zero");
		else System.out.println(number+" Given number is Negative");
	}

}
