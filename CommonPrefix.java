package Programs;
import java.util.*;
//Declaring the another  class 
class Common{
	//Declaring the another method
	String prefix(String str1,String str2) {
		String result="";
		if(str1=="")return str2;
		for(int index=0;index<str1.length();index++) {
			if(str1.charAt(index)!=str2.charAt(index)) {
				return result;
			}
			result=result+str2.charAt(index);
		}
		return result;
	}
	String seprate(String[] arr,int size) {
		String pr="";
		for(int index=0;index<size;index++) {
			pr=prefix(pr,arr[index]);
		}
		return pr;
	}
}
public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		String[] array=new String[size];
		for(int index=0;index<size;index++) {
			array[index]=in.next();
		}
		Common com=new Common();
		String prifix= com.seprate(array,size);
		System.out.println(prifix);
	}

}
