import java.util.*;
	public class JaggedArray
	{
		public static void main(String[] args) {
		    Scanner in=new Scanner(System.in);
		    System.out.print("Enter the number of Rows in jagged array : ");
		    int n=in.nextInt();
		    int ar[]=new int[n];
			int arr[][]=new int[n][];
			System.out.println("\nEnter the number of Column  ");
			for(int i=0;i<n;i++){
			   System.out.print("\nEnter the number of Column "+i+" in jagged array : ");
			   ar[i]=in.nextInt();
			   arr[i]=new int[ar[i]];
			   }
			   System.out.println("Enter the elements of array : ");
			   for(int i=0;i<n;i++){
			       for(int j=0;j<arr[i].length;j++){
			           arr[i][j]=in.nextInt();
			       }
			   }
			   for(int i=0;i<n;i++){
			       for(int j=0;j<arr[i].length;j++){
			           System.out.print(arr[i][j]+" ");
			       }
			       System.out.println();
			   }
			   
		}
	}
