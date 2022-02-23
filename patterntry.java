package Programs;
/*
 n=5
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 
 */
import java.util.*;
public class patterntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
