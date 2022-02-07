import java.util.*;
public class PatternPyramid6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of pyramid : ");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n-i;k>0;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
