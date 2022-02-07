import java.util.*;
public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Characete to check");
		char character=input.next().charAt(0);
		if(character>='a'&&character<='z'||character>='A'&&character<='Z')System.out.println(character+" It's Alphabet");
		else System.out.println(character+" It's not Alphabet");

	}

}
