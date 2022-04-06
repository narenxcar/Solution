import java.util.*;
public class RomantoInteger {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Roman Numbers to convert into integer :");
		String roman=in.next();
		int num=roman.length();
		int first=0,second=0,result=0;
		for(int index=0;index<num;index++)
		{	
			char c=roman.charAt(index);
			switch(c) {
			case 'I':
				first=1;
				break;
			case 'V':
				first=5;
				break;
			case 'X':
				first=10;
				break;
			case 'L':
				first=50;
				break;
			case 'C':
				first=100;
				break;
			case 'D':
				first=500;
				break;
			case 'M':
				first=1000;
				break;
			}
			if(first>second && index != 0) {
				result-=second;
				int temp=first-second;
				result+=temp;
				second=first;
				
			}else {
			second=first;
			result+=first;
			}
		}
		System.out.println("The integer is "+result);
		}

}
