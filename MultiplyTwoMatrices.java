import java.util.*;
public class MultiplyTwoMatrices {
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
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr1[i][j]*=arr2[i][j];
			}
		}
		System.out.println("Two Arrays are Multiplied");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

	}
