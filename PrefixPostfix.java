import java.util.*;
public class PrefixPostfix {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the value to perform");
		int inc=input.nextInt();
		int preincrement= ++inc;
		System.out.println("Pre-Increment "+ preincrement);
		int predeincrement= --inc;
		System.out.println("Pre-Decrement "+ predeincrement);
		int postincrement= inc++;
		System.out.println("Post-Increment "+ preincrement);
		int postdeincrement= inc--;
		System.out.println("Post-Decrement "+ preincrement);
	}

}
