/*n
12345
1234
123
12
1
1
12
123
1234
12345
 * 
 */
import java.util.Scanner;

public class PatternProgram4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of row to print patter : ");
		int n=in.nextInt();
		for (int i=n;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
