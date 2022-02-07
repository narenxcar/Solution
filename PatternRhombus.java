import java.util.*;
public class PatternRhombus {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Rhombus :");
		int a=input.nextInt();
		for(int i=1;i<=a;i++){
		    for(int j=1;j<=a-i;j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=i;k++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i=1;i<a;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(" ");
		    }
		    for(int k=a-i;k>0;k--){
		        System.out.print("* ");
		    }
		    System.out.println();
		}


	}

}
