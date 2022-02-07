import java.util.*;
public class Keywordlong {
		
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Press 1 to show size of boolean");
		System.out.println("Press 2 to show size of char");
		System.out.println("Press 3 to show size of byte");
		System.out.println("Press 4 to show size of short");
		System.out.println("Press 5 to show size of int");
		System.out.println("Press 6 to show size of long");
		System.out.println("Press 7 to show size of float");
		System.out.println("Press 8 to show size of double");
		System.out.println("Press other to exit");
		while(true) {
			int s=input.nextInt();
		switch(s) {
		case 1:
		System.out.println("Size of boolean keyword is "+1+" bit");
		break;
		case 2:
			System.out.println("Size of char keyword is "+2+ " byte");
			break;
		case 3:
			System.out.println("Size of byte keyword is "+1+ " byte");
			break;
		case 4:
			System.out.println("Size of short keyword is "+2+ " byte");
			break;
		case 5:
			System.out.println("Size of int keyword is "+4+ " byte");
			break;
		case 6:
			System.out.println("Size of long keyword is "+8+ " byte");
			break;
		case 7:
			System.out.println("Size of float keyword is "+4+ " byte");
			break;
		case 8:
			System.out.println("Size of double keyword is "+8+ " byte");
			break;
		default:
			System.exit(0);
	}
	}
	}
}
