/*
			* 		 *       
			**      **
			***    ***
			****  ****
			**********
			****  ****
			***    ***
			**      **
			*        *

 */
package Problems;
import java.util.*;
public class Patterncrossinverintgtriangle {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i)System.out.print("*");
				else System.out.print(" ");
			}
			for(int k=n;k>=1;k--) {
				if(k>i)System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j>=i)System.out.print("*");
				else System.out.print(" ");
			}
			for(int k=1;k<=n;k++) {
				if(k>=i)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}*/
		int h=n*2;
		for(int i=1;i<=n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if(i>=j ||j>=h) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
