package Programs;
import java.util.*;
public class Stringsof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="Hello";
		//It compare the both string if its same it return true else false
		if(s1==s2) {
			System.out.println("String are same : "+true);
		}else System.out.println("String are not same : "+false);
		////
		Scanner in=new Scanner(System.in);
		String s3=in.next();
		String s4=in.next();
		//While compare both string it return false statement
		if(s3==s4) {
			System.out.println("String are same : "+true);
		}else System.out.println("String are not same : "+false);
		//This is the method use to convert short array to string
		byte[] arr= {78,97,114,101,110,100,114,97,110};
		String s5=new String(arr);
		System.out.println(s5);
	}

}
