import java.util.Scanner;

public class PatternPyramid2 {

		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the size of pyramid : ");
			int a=input.nextInt();
			for(int i=1;i<=a;i++){
			    for(int j=1;j<=a-i;j++){
			        System.out.print(" ");
			    }
			    for(int k=1;k<=i;k++){
			        System.out.print(k+" ");
			    }
			    System.out.println();
			}

}
}