import java.util.*;
public class AsciiValue {
	static short ascii(char a) {
		short n=(short)a;
		return n;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Enter character :");
		char character=input.next().charAt(0);
		System.out.println("The ASCII value of "+character+" is "+ascii(character));
	}

}
