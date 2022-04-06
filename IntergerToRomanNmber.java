import java.util.*;
public class IntergerToRomanNmber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] listValue= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] listChar= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		System.out.print("Enter the integer value to convert into roman number : ");
		int value=in.nextInt();
		String result="";
		while(value>0) {
			for(int index=0;index<listValue.length;index++) {
				if(value>=listValue[index]) {
					value-=listValue[index];
					result+=listChar[index];
					break;
				}
			}
		}
		System.out.print("The roman number for integer value is : ");
		System.out.println(result);
	}

}
