import java.util.*;
public class MultiplytwoMatricesUsingFunction {
	static int[][] matirxmultiply(int arr1[][],int arr2[][]){
		int arr3[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for (int k=0;k<3;k++) {
					arr3[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		return arr3;
	}
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
		System.out.println("Enter array2 element 3x3 ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr2[i][j]=input.nextInt();
			}
		}
		int arr3[][]=matirxmultiply(arr1,arr2);
		System.out.println("Matirx Multiplied by using method");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
