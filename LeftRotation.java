package Problems;


/*
 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.

Example


After  rotations, .

Function Description

Complete the rotateLeft function in the editor below.

rotateLeft has the following parameters:

int d: the amount to rotate by
int arr[n]: the array to rotate
Returns

int[n]: the rotated array
Input Format

The first line contains two space-separated integers that denote , the number of integers, and , the number of left rotations to perform.
The second line contains  space-separated integers that describe .

Constraints

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
 */
import java.util.*;
// Declaring class for rotating 
class Rotation {
	//Declaring method to do the process of left rotation
    public int[] rotateLeft(int[] arr,int rotate){
    	//initializing temp variable for storing temporary values
    int temp=0;
    // First loop execute till how many shifting should done
        for(int index=0;index<rotate;index++){
        	// store the first value in array in temp variable for shifting process 
            temp=arr[0];
            // second loop execute the shifting process till before last element of array 
            for(int rot=0;rot<arr.length-1;rot++){
                arr[rot]=arr[rot+1];
            }
            //assign the temp value at last element of array
            arr[arr.length-1]=temp;
            
        }
        // Shifting process is over return the array
    return arr;
    }
}
//Main Class
public class LeftRotation {
	// Main method
	public static void main(String[] args) {
		//creating object for scanner class 
		Scanner in=new Scanner(System.in);
		//initializing size of array
		System.out.print("Enter the size of an array : " );
        int size=in.nextInt();
        //creating an variable for shifting count 
        System.out.print("Enter the value to that how mainy times it to shift value at last : " );
        int rotate=in.nextInt();
        // Initializing the array and size of array
        int arr[]=new int[size];
        System.out.print("Enter the elements of an array : " );
        for(int index=0;index<size;index++){
            arr[index]=in.nextInt();
        }
        //creating object for Rotation class 
        Rotation res=new Rotation();
        // passing parameter to rotateLeft method that return array that array store in same previous used array
        arr=res.rotateLeft(arr,rotate);
        System.out.println("Ther array is make left rotatation ");
        for(int index=0;index<arr.length;index++){
            System.out.print(arr[index]+" ");
        }

	}

}
