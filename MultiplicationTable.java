import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number tabel to generate ");
		int table=input.nextInt();
		System.out.print("Enter the number to generate till  ");
		int nth=input.nextInt();
		for(int i=1;i<=nth;i++) {
			System.out.println(table+" * "+i+" = "+table*i);
		}

	}

}
