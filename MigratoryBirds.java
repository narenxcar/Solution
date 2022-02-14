/*Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example

There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type .

Function Description

Complete the migratoryBirds function in the editor below.

migratoryBirds has the following parameter(s):

int arr[n]: the types of birds sighted
Returns

int: the lowest type id of the most frequently sighted birds
Input Format

The first line contains an integer, , the size of .
The second line describes  as  space-separated integers, each a type number of the bird sighted.

Constraints

It is guaranteed that each type is , , , , or .
Sample Input 0

6
1 4 4 4 5 3
Sample Output 0

4
Explanation 0

The different types of birds occur in the following frequencies:

Type :  bird
Type :  birds
Type :  bird
Type :  birds
Type :  bird
The type number that occurs at the highest frequency is type , so we print  as our answer.

Sample Input 1

11
1 2 3 4 5 4 3 2 1 3 4
Sample Output 1

3
*/

import java.util.*;
//Declaring the another class
class Birds {
	//Declaring the method to find which which type of birds highly migrated 
    public int migratoryBirds(int[] arr,int size) {
    	//creating count of array as like hash map
        int[] count=new int[size];
        //Initializing max and  for finding highest value which having n number
        //Initializing maxindex use to store which value is higher
        int max=0,maxindex=0;
        //loop use to increment value in (arr[index]) as index
        for(int index=0;index<size;index++){
            count[arr[index]]++;
        }
        //loop use to find which having higher number
        for(int index=0;index<size;index++){
            if(count[index]>0){
                if(count[index]>max){
                    max=count[index];
                    maxindex=index;
                }
            }
        }
        // reuturn the maxindex that value is higher repeting number
       return maxindex; 
    }

}
//Declaring the main class

public class MigratoryBirds {
	//Declaring the main method
	public static void main(String[] args) {
		//Creating the object for scanner class
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		//get input from user as array size
	       int size=in.nextInt();
	       //initializing the array and it size
	       int[] array=new int[size];
	       System.out.println("Enter the elements of array : ");
	       //geting array element from user
	       for(int index=0;index<size;index++){
	           array[index]=in.nextInt();
	       }
	       //Create object for another class
	       Birds bird=new Birds();
	       System.out.print("The highest type of birds which migrated : " );
	       System.out.println(bird.migratoryBirds(array,size));

	}

}
