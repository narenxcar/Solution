import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Press + to make Addition\nPress - to make Subtraction\nPress * to make Multiplication\nPress / to make Division\nPress % to find Reminder");
		char character=input.next().charAt(0);
		switch(character) {
		case '+':
			System.out.println("ADDITION:");
			System.out.println("Ente the first value");
			int a=input.nextInt();
			System.out.println("Ente the second value");
			int b=input.nextInt();
			a=a+b;
			System.out.println("ANSWER = "+a);
			break;
		case '-':
			System.out.println("SUBTRACTION:");
			System.out.println("Ente the first value");
			int c=input.nextInt();
			System.out.println("Ente the second value");
			int d=input.nextInt();
			c=c-d;
			System.out.println("ANSWER = "+c);
			break;
		case '*':
			System.out.println("MULTIPLICATION:");
			System.out.println("Ente the first value");
			int e=input.nextInt();
			System.out.println("Ente the second value");
			int f=input.nextInt();
			e=e*f;
			System.out.println("ANSWER = "+e);
			break;
		case '/':
			System.out.println("DIVISION:");
			System.out.println("Ente the first value");
			int g=input.nextInt();
			System.out.println("Ente the second value");
			int h=input.nextInt();
			g=g/h;
			System.out.println("ANSWER = "+g);
			break;
		case '%':
			System.out.println("MODULO:");
			System.out.println("Ente the first value");
			int i=input.nextInt();
			System.out.println("Ente the second value");
			int j=input.nextInt();
			i=i%j;
			System.out.println("ANSWER = "+i);
			break;
			default:
				System.out.println("Invalide input");
		}
	}

}
