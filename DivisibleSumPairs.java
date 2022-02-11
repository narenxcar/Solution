package Problems;
/*Given an array of integers and a positive integer , 
determine the number of  pairs where  and  +  is divisible by .

Example



Three pairs meet the criteria:  and .

Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array 
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format

The first line contains  space-separated integers,  and .
The second line contains  space-separated integers, each a value of .

Constraints

Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
Sample Output

 5
 */

import java.util.*;
//DEclaring a class for this process
class Divisible {
	// Declaring method for this execution
    public int divisibleSumPairs(int size, int base, int[] arr) {
    	// Initialization count to pair of vale  divisible by base valu
        int count=0;
        // This for loop execute travels from first to last before
        System.out.println("Index1  index2  added value");
        for(int index=0;index<size-1;index++){
        	//this loops helps to make sum
        	
            for(int index2=index+1;index2<size;index2++){
            	//checking whether it is divisible by base value
            if((arr[index]+arr[index2])%base==0 ){
            	System.out.println(index+"      "+index2+ "       "+arr[index]+arr[index2]);
                    count++;
                }
            }
        }
        return count;
    }

}
//Declaring the main class 
public class DivisibleSumPairs {
//declaring the main method
	public static void main(String[] args) {
		// creating object for scanner class
		Scanner in=new Scanner(System.in);
		//Initialize the size of array
		System.out.print("Enter the size of array : ");
        int size=in.nextInt();
        System.out.print("Enter the base value to check divisible : ");
        int base=in.nextInt();
        //Initialize the array and it size
        System.out.println("Enter the element of array ");
        int arr[]=new int[size];
        //geting input from user
        for(int index=0;index<size;index++){
            arr[index]=in.nextInt();
        }
        //creating object for Divisible class
        Divisible div=new Divisible();
        //calling method which in Divisible class and passing parameter then it print the output
        int count=div.divisibleSumPairs(size,base,arr);
        System.out.print("The count of divisible sum of pairs is : "+count);

	}

}
