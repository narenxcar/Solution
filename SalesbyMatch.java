/*
 * There is a large pile of socks that must be paired by color. 
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example


There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers, , the colors of the socks in the pile.

Constraints

 where 
Sample Input

STDIN                         Function
-----                       --------
9                             n = 9
10 20 20 10 10 30 50 10 20     ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
Sample Output

3

Explanation
 */
import java.util.*;
//Declaring another class
class Sales {
	//Declaring another method to perform function
    public int sockMerchant(int[] count) {
    	//Initialize the integer pairs 
        int pairs=0;
        //make a loop execute till the array last element
        for(int index=0;index<count.length;index++){
        	//execute the statement is true
            if(count[index]%2==0){
                pairs+=count[index]/2;
            }//if false execute this statement
            else{
            	 count[index]-=1;
                 count[index]/=2;
                 pairs+=count[index];
            }
            }
        return pairs;
    }

}//DEclaring the main class
public class SalesbyMatch {
	//Declaring the main methods
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		//Initializing the size of array
	       int size=in.nextInt();
	       System.out.println("Enter the elements : ");
	       //Initializing the another array for counting increment 
	       int[] count=new int[101];
	       //loop use to get input from user then count increment
	       for(int index=0;index<size;index++){
	           int a=in.nextInt();
	           count[a]++;
	       }  
	       //creating object for Sales class
	       Sales sale=new Sales();
	       //passing parameter to the method the method return the value that value printed
	       System.out.print("The number of pairs set is : ");
	       System.out.println(sale.sockMerchant(count));

	}

}
/*
 * import java.util.*;
public class Solution {
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int size=in.nextInt();
      Set<Integer>pairs=new HashSet<>();
      int count=0;
       for(int index=0;index<size;index++){
           int a=in.nextInt();
           if(!pairs.contains(a)){
               pairs.add(a);
           }else{
               count++;
               pairs.remove(a);
           }
       }
       System.out.println(count);  
        }
}
*/
