import java.util.*;
public class LeapYearOrNot {
	static void leap(short year) {
		if(year%400==0)System.out.println(year + " Is Leap Year");
		else if(year%100==0) System.out.println(year + " Is not a Leap Year");
		else if(year%4==0) System.out.println(year + " Is Leap Year");
		else System.out.println(year + " Is not a Leap Year");
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year to find leap ");
		short year=input.nextShort();
		leap(year);	
	}

}
