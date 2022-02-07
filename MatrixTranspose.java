import java.util.*;
public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int arr1[][]=new int [3][3];
		int arr2[][]=new int [3][3];
		System.out.println("Enter array1 element 3x3 ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr1[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr2[i][j]=arr1[j][i];
			}
		}System.out.println("Matrix Transpose");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
