import java.util.*;
public class LargestNumber {
	static int larger(int a,int b,int c) {
		return (a>b)?(a>c)?a:c:(b>c)?b:c;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first value");
		int first=input.nextInt();
		System.out.println("Enter the second value");
		int second=input.nextInt();
		System.out.println("Enter the third value");
		int third=input.nextInt();
		int result=larger(first,second,third);
		System.out.println("The largest value is "+result);
	}

}
