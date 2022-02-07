import java.util.*;
public class PatternPyramid4 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the size of pyramid : ");
		int n=input.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n*2;j>i*2;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			for(int h=i-1;h>=1;h--) {
				System.out.print(h+" ");
			}
			System.out.println();
		}

	}

}
