import java.util.*;
class Matrix{
	/* This method use to rotate matrix in 90 degree clockwise direction*/
	public int[][] rotatmatrix(int arr[][]){
		int rowindex=arr.length;
		int columnindex=arr[0].length;
		int temp=0;
		int rotatarr[][]=new int[rowindex][columnindex];
		for(int i=0;i<rowindex;i++) {
			for(int j=columnindex-1;j>=0;j--) {
				rotatarr[i][temp++]=arr[j][i];
			}
			temp=0;
		}
		return rotatarr;
	}
}
//main class
public class RotationOfMatrix {
	//main method
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the size of matrix : ");
		int a=input.nextInt();
		int arr[][]=new int[a][a];
		// Getting input of array from user 
		System.out.println("Enter the elements in array");
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
			arr[i][j]=input.nextInt();
			}
		}
		// loop  execute till user exits 
			while(true) {
			System.out.println("Press 1 to rotate matrix 90 degree ");
			System.out.println("Press 2 to exit ");
			System.out.println("Enter your choise ");
			int num=input.nextInt();
				switch(num){
						case 1:
							System.out.println("Matrix array Rotated 90 degree : ");
							//creating object for matrix class
							Matrix mat=new Matrix();
							//return the rotated values in same array of arr
							arr=mat.rotatmatrix(arr);
							// print the values and check whether it rotated not
							for(int i=0;i<a;i++) {
								for(int j=0;j<a;j++) {
								System.out.print(arr[i][j]+" ");
								}
								System.out.println();
							}
						break;
						case 2:
							System.exit(0);
						default:
							System.out.println("Invalid input");
				}

			}
	}
}
