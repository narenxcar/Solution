/*
 * Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlock must determine the number of square integers within that range.

Note: A square integer is an integer which is the square of an integer, e.g. 

Example
a=3 b=9
2*2=4, 3*3=9 
count =2
a=17 b=24
there ara no square in between the range
count =0

There are three square integers in the range:  and . Return .

Function Description

Complete the squares function in the editor below. It should return an integer representing the number of square integers in the inclusive range from  to .

squares has the following parameter(s):

int a: the lower range boundary
int b: the upper range boundary
Returns

int: the number of square integers in the range
Input Format

The first line contains , the number of test cases.
Each of the next  lines contains two space-separated integers,  and , the starting and ending integers in the ranges.

Constraints



Sample Input

2
3 9
17 24
Sample Output

2
0
Explanation

Test Case #00: In range ,  and  are the two square integers.
Test Case #01: In range , there are no square integers.
 * 
 */
import java.util.*;
class Square{
public static int squares(int a, int b) {
    // Write your code here
    int count=0,i=1;
    while(i*i<a)i++;
    while(i*i<=b){
        i++;
        count++;
    }
    return count;
    }

}
public class SherlockandSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the initial range : ");
		int a=in.nextInt();
		System.out.print("Enter the ending range : ");
		int b=in.nextInt();
		Square sqr=new Square();
		System.out.print("Total number of squares in the range is  : ");
		System.out.print(sqr.squares(a, b));
	}

}
