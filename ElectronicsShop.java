/*
 * A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget.
 Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return .

Example



The person can buy a , or a . Choose the latter as the more expensive option and return .

Function Description

Complete the getMoneySpent function in the editor below.

getMoneySpent has the following parameter(s):

int keyboards[n]: the keyboard prices
int drives[m]: the drive prices
int b: the budget
Returns

int: the maximum that can be spent, or  if it is not possible to buy both items
Input Format

The first line contains three space-separated integers , , and , the budget, the number of keyboard models and the number of USB drive models.
The second line contains  space-separated integers , the prices of each keyboard model.
The third line contains  space-separated integers , the prices of the USB drives.

Constraints

The price of each item is in the inclusive range .
Sample Input 0

10 2 3
3 1
5 2 8
Sample Output 0

9
Explanation 0

Buy the  keyboard and the  USB drive for a total cost of .

Sample Input 1

5 1 1
4
5
Sample Output 1

-1
 */

import java.util.*;
//Declaring the another class Sho
class Shop{
	//Declaing the method for performing task
	public int electronics(int[] arr1,int[] arr2,int key){
		//Initializing max int for find maximum value can assigin
        int max=-1;
        //first loop compare first  array to second array completely 
        for(int index=0;index<arr1.length;index++){
        	//second loop tool to compare
            for(int index2=0;index2<arr2.length;index2++){
            	//the main statement the sum of two array of index is not be more than key value and higher than max
                if(arr1[index]+arr2[index2]<=key && max<(arr1[index]+arr2[index2])){
                	//Assign the sum of two array to max
                max=arr1[index]+arr2[index2];
                }
            }
        }
        // you get final value so return max
        return max;
    }
}
//main class
public class ElectronicsShop {
	//main method
	public static void main(String[] args) {
		//create object for scanner class
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the key value : ");
		//Initializing key value use to compare
        int key=in.nextInt();
        System.out.print("Enter the size of first array : ");
        //Initializing size1 to size of first array
        int size1=in.nextInt();
        System.out.print("Enter the size of second array : ");
        //Initializing size2 to size of second array
        int size2=in.nextInt();
        //Initializing the first array with size 
        int[] arr1=new int[size1];
      //Initializing the Second array with size 
         int[] arr2=new int[size2];
         System.out.println("Enter the elements of first array : ");
         //getting input from user for first array
         for(int index=0;index<size1;index++){
             arr1[index]=in.nextInt();
         }
         //getting input from user for Second array
         System.out.println("Enter the elements of second array : ");
         for(int index=0;index<size2;index++){
             arr2[index]=in.nextInt();
         }
         //creating object for class
         Shop s=new Shop();
         System.out.print("Buy the  keyboard and the  USB drive for a total cost of : ");
         //passing argument to method then return value is printed
         System.out.println(s.electronics(arr1,arr2,key));
    }
}