
import java.util.*;
class DigitSum{
	int superDigit(String digit) {
		 //System.out.println(digit);
	        if(digit.length()==1)return ((int)digit.charAt(0)-48);
	        String sum="";
	        int total=0;
	        for(int index=digit.length()-1;index>=0;index--){
	            total+=((int)digit.charAt(index))-48;
	        }
	        while(total>0){
	            sum=((char)((total%10)+48))+sum;
	            total=total/10;
	        }
	    return superDigit(sum);
	}
}
public class RecursiveDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value in string : ");
		String digits=in.next();
		System.out.print("Enter the value to make initial addition : ");
		int add=in.nextInt();
		DigitSum digitsum=new DigitSum();
		String temp="";
		while(add>0) {
			temp+=digits;
			add--;
		}
		System.out.println(digitsum.superDigit(temp));
	
	}

}
