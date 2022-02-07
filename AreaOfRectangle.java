import java.util.*;
public class AreaOfRectangle {
	static int arearectangle(int l,int b) {
		return l*b;
	}
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the length of Rectangle : ");
        int length=input.nextInt();
        System.out.println();
        System.out.print("Enter the breath of Rectangle : ");
        int breath=input.nextInt();
        System.out.println("Area of rectangle : "+ arearectangle(length,breath));

	}

}
