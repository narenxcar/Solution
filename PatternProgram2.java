/*
1
22
333
4444
55555
 */
import java.util.Scanner;

public class PatternProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner in=new Scanner(System.in);
				System.out.print("Enter the number of row to print patter : ");
				int n=in.nextInt();
				for(int i=1;i<=n;i++){
				    for(int j=1;j<=i;j++){
				        System.out.print(i);
				    }
				    System.out.println();
				}
			}

		}
