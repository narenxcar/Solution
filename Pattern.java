import java.util.*;
public class Pattern {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of pattern ");
		int a=in.nextInt();
		for(int i=0;i<=a;i++){
		    for(int j=1;j<=a-i;j++){
		        System.out.print("@");
		    }
		    for(int k=0;k<=i*2;k++){
		        System.out.print("%");
		    }
		    for(int h=0;h<a-i;h++){
		        System.out.print("@");
		    }
		    System.out.println();
		}
		}
	}
