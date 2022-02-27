/*
 * 	5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

 * 
 * 
 */
import java.util.Scanner;

public class patternProgramming19 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of row to print patter : ");
		int n=in.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j>=i)System.out.print(j+" ");
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

}
