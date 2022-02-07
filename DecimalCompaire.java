import java.util.*;
public class DecimalCompaire {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
float a=input.nextFloat();
double b=input.nextDouble();
if(a==b)System.out.println("Correct");
else System.out.println("Not correct");
float c=8.5f;
double d=8.5;
System.out.println(c==d);
}
}