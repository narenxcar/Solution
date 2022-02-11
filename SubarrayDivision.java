package Problems;
/*Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example



Lily wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria:  and .

Function Description

Complete the birthday function in the editor below.

birthday has the following parameter(s):

int s[n]: the numbers on each of the squares of chocolate
int d: Ron's birth day
int m: Ron's birth month
Returns

int: the number of ways the bar can be divided
Input Format

The first line contains an integer , the number of squares in the chocolate bar.
The second line contains  space-separated integers , the numbers on the chocolate squares where .
The third line contains two space-separated integers,  and , Ron's birth day and his birth month.

Constraints

, where ()
Sample Input 0

5
1 2 1 3 2
3 2
Sample Output 0

2
*/
import java.util.*;
//Declaring another class to perform separation of chocolate 
class Subdivi{
  //Declaring an method 
  public static int birthday(int arr[], int d, int m) {
	  //Initializing the sum and count for execution process
  int sum=0,count=0;
  //creating loop for travels from first to last square of chocolate
  for(int index=0;index<arr.length;index++){
	  //declaring 0 to sum for every iteration 
      sum=0;
      //this loop used to sum the adjacent value in array 
      if(arr[index]!=d) {
      for(int coun=0;coun<m&&coun+index<arr.length;coun++){
          sum+=arr[index+coun];
      }
      // It compare the value then if its true it increment the count
      if(sum==d){
          count++;
      }
      }
  }
  //return the count value
  return count;
  }

}

//Declaring the main class
public class SubarrayDivision {
	//Declaring the main method
	public static void main(String[] args) {
		//creating object for scanner class
		Scanner in=new Scanner(System.in);
	       System.out.print("Enter the size of chocolate : ");
	       //Initializing the size of an chocolate array
	       int size=in.nextInt();
	       System.out.println("Enter the integer value present inside the chocolate square :");
	       //Initializing the chocolate array and size to an array
	    int[] chocolate=new int[size];
	    //getting input from use and storing in array
	    for(int index=0;index<size;index++){
	        chocolate[index]=in.nextInt();
	    }
	    System.out.print("Enter the date which he born : ");
	    //Initializing the date which he born that use to compare
	    int date=in.nextInt();
	    System.out.print("\nEnter the month which he born : ");
	  //Initializing the month which he born that use to make addition
	    int month=in.nextInt();
	    //creating object for class
	    Subdivi div=new Subdivi();
	    //passing parameter to object and printing the return staement
	    System.out.println(div.birthday(chocolate,date,month));
	}

}
