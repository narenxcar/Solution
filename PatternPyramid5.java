import java.util.*;
public class PatternPyramid5 {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the size of Pyramid : ");
		int n=input.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print(k+" ");
			}
			for(int h=n-1;h>=i;h--) {
				System.out.print(h+" ");
			}
			System.out.println();
		}
		

	}

}
