import java.util.*;
	
public class ReverseSentenceUsingRecursion {
static String reverse(String s,int n) {
	String s1="";
		char s2=s.charAt(n);
		s1+=s2;
		if(n==0) {
			return s1+' ';
		}
		
		return s1+reverse(s,n-1);
	}
	static String sentence(String sen,int n) {
		String ans="";
		String temp="";
		for(int i=0;i<=n;i++) {
			char s=sen.charAt(i);
			if(s==' ' || i==n) {
				ans+=reverse(temp,temp.length()-1);
				temp="";
			}
			else {
				temp+=s;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the sentence to reverse : ");
		String s=input.nextLine();
		int n=s.length()-1;
		String reversstring=reverse(s,n);
		System.out.println("Reversed String "+ reverse(s,n));
		System.out.println("The reverse sentence is : ");
		System.out.print(sentence(reversstring,reversstring.length()-1));
		

	}

}
