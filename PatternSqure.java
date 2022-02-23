/*
*****
*   *
*   *
*   *
*****
*/
package Programs;
import java.util.*;
public class PatternSqure {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int row=in.nextInt();
		System.out.print("Enter the number of columns : ");
		int column=in.nextInt();
		for(int index1=0;index1<row;index1++) {
			for(int index2=0;index2<column;index2++) {
				if(index1==0 || index2==0 ||index1==row-1 || index2==column-1)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
