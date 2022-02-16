/*
 * An integer  is a divisor of an integer  if the remainder of .

Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Example

Check whether ,  and  are divisors of . All 3 numbers divide evenly into  so return .


Check whether , , and  are divisors of . All 3 numbers divide evenly into  so return .


Check whether  and  are divisors of .  is, but  is not. Return .

Function Description

Complete the findDigits function in the editor below.

findDigits has the following parameter(s):

int n: the value to analyze
Returns

int: the number of digits in  that are divisors of 
Input Format

The first line is an integer, , the number of test cases.
The  subsequent lines each contain an integer, .

Constraints



Sample Input

2
12
1012
Sample Output

2
3
Explanation

The number  is broken into two digits,  and . When  is divided by either of those two digits, the remainder is  so they are both divisors.

The number  is broken into four digits, , , , and .  is evenly divisible by its digits , , and , but it is not divisible by  as division by zero is undefined.
 */
import java.util.*;
class Digits {
    public static int findDigits(int n) {
        int count=0,num=n;
        while(num>0){
            int r=num%10;
            if(r!=0 && n%r==0)count++;
            num/=10;
        }
        return count;
    }

}
public class FindDigits {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 System.out.print("Enter the number of test case : " );
	        int test=in.nextInt();
	        Digits d=new Digits();
	        while(test>0){
	        	System.out.print("Enter the number to count that divisible by digit of number : ");
	            int number=in.nextInt();
	            System.out.print(number+" is divisible by ");
	            System.out.println(d.findDigits(number)+" digit");
	            test--;
	        }
	    }
	}
