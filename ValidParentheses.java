import java.util.*;
public class ValidParentheses {
	public static boolean parentheses(String parentheses) {
		Hashtable<Character,Character> table=new Hashtable<Character,Character>();
		table.put('}','{');
		table.put(')','(');
		table.put(']','[');
	int demo=0;
	for(int index=0;index<parentheses.length();index++) {
		if(table.containsKey(parentheses.charAt(index))) {
			char temp=parentheses.charAt(index);
			if(parentheses.charAt(--demo)!=table.get(temp)) {
				return false;
			}
		}else {
		demo++;
		}
	}
	return true;
}

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.print("Enter the parentheses to check is valid or not : ");
String parentheses=in.next();
	System.out.println(ValidParentheses.parentheses(parentheses));
	}

}
