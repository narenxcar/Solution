import java.util.*;
public class Conversion {
	static float convert(float t1,float t2) {
		return t1*t2;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float type1,type2;
		System.out.println("Enter Type 1 value");
		type1=input.nextFloat();
		System.out.println("Enter Type 2 value");
		type2=input.nextFloat();
		System.out.println("Converted output = "+ convert(type1,type2));
	}

}
