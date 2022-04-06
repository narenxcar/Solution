import java.util.*;
class conversion{
	String intToString(int value) {
		
		String temp="";
		if(value==0)return temp;
		if(value>=900) {
			if(value<1000 && value>=900) {
				temp+=intToString(value%900)+"M";
			}else {
			temp+="M"+intToString(value-1000);
			}
		}else if(value>=400){
			if(value>=400 && value<500) {
				temp+=intToString(Math.abs(value-500))+"D";
			}else {
			temp+="D"+intToString(value-500);
			}
		}else if(value>=90) {
			if(value>=90 && value<100) {
				temp+=intToString(Math.abs(value-100))+"C";
			}else {
			temp+="C"+intToString(value-100);
			}
		}else if(value>=40) {
			if(value>=40 && value<50) {
				temp+=intToString(Math.abs(value-40))+"L";
			}else {
			temp+="L"+intToString(value-50);
			}
		}else if(value>=9) {
			if(value==9) {
				temp=intToString(Math.abs(value-10))+"X";
			}else {
			temp+="X"+intToString(value-10);
			}
		}else if(value>5) {
			if(value==4) {
				temp=intToString(Math.abs(value-5))+"V";
			}else {
			temp+="V"+intToString(value-5);
			}
		}else {
			temp+="I"+intToString(value-1);
		}
		return temp;
	}
}
public class IntegerToRoman {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the integer value to conver Roman number : ");
		int value=in.nextInt();
		System.out.print("The Roman number are : ");
		conversion convert=new conversion();
		System.out.print(convert.intToString(value));

	}

}
