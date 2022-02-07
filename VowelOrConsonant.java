import java.util.*;
public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the character to check");
		char character=input.next().charAt(0);
		if(character>='a'&&character<='z'||character>='A'&&character<='Z') {
		if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||character=='A'||character=='E'||character=='I'||character=='O'||character=='U')System.out.println(character+" is Vowel");
		else System.out.println(character+" is Consonant");}
		else System.out.println("Invalid input");

	}

}
