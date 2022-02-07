import java.util.*;
public class PatternPyramid7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of Pyramid : ");
		int n=input.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
