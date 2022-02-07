import java.util.*;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number to check whether even or odd");
		int number=input.nextInt();
		if(number%2==0)System.out.println(number+" is Even number");
		else System.out.println(number+" is Odd number");
	}
}
