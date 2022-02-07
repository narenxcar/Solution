import java.util.*;
public class PatternInvertingTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the inverting triangle size ");
		int a=input.nextInt();
		for(int i=0;i<a;i++){
		    System.out.println();
		    for(int j=i;j>0;j--){
		        System.out.print(" ");
		    }
		    for(int k=i;k<a;k++){
		        System.out.print("* ");
		    }
		}
		System.out.println();
		for(int i=2;i<=a;i++){
		    for(int j=a-i;j>0;j--){
		        System.out.print(" ");
		    }
		    for(int k=0;k<i;k++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}


	}

}
