/*
 * The distance between two array values is the number of indices between them. Given , find the minimum distance between any pair of equal elements in the array. If no such value exists, return .

Example

There are two matching pairs of values:  and . The indices of the 's are  and , so their distance is . The indices of the 's are  and , so their distance is . The minimum distance is .

Function Description

Complete the minimumDistances function in the editor below.

minimumDistances has the following parameter(s):

int a[n]: an array of integers
Returns

int: the minimum distance found or  if there are no matching elements
Input Format

The first line contains an integer , the size of array .
The second line contains  space-separated integers .

Constraints

Output Format

Print a single integer denoting the minimum  in . If no such value exists, print .

Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
7 1 3 4 1 7     arr = [7, 1, 3, 4, 1, 7]
Sample Output

3
Explanation
There are two pairs to consider:

 and  are both , so .
 and  are both , so .
The answer is .

 */
import java.util.*;
class Res{
 public static int minimumDistances(int[] arr) {
    // Write your code here
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                if(min>j-i){
                    min=j-i;
                }
            }
        }
    }
    if(min==Integer.MAX_VALUE)return -1;
return min;
    }

}
public class MinimumDistances {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	       int n=in.nextInt();
	       int[] arr=new int[n];
	       for(int i=0;i<n;i++){
	           arr[i]=in.nextInt();
	       }
	       Res result=new Res();
	       System.out.println(result.minimumDistances(arr));
	    }
	}
