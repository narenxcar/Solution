/*
 * 
 * 	There is a string, ,
 of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.

Example


The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Returns

int: the frequency of a in the substring
Input Format

The first line contains a single string, .
The second line contains an integer, .

Constraints

For  of the test cases, .
Sample Input

Sample Input 0

aba
10
Sample Output 0

7
Explanation 0
The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .

Sample Input 1

a
1000000000000
Sample Output 1

1000000000000
Explanation 1
Because all of the first  letters of the infinite string are a, we return .
 */

import java.util.*;
class Repeated{
public static long repeatedString(String s, long n) {//abad abad ab 
	//10/4=2
	 long n1=s.length(),count=0;//abad
	    for(int i=0;i<n1;i++){
	           if('a'==s.charAt(i)){
	               count++;
	           }
	    }
	        long temp=n%n1;
	         n/=n1; 
	         count*=n;
	        for(int i=0;i<temp;i++){
	           if('a'==s.charAt(i)){
	               count++;
	           }
	        }
	       
	    return count;
	    } 
	    }
public class RepeatedString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the string : ");
        String s=in.next();
        System.out.print("Enter the number of times string to repeate : ");
        long n=in.nextLong();
        Repeated result=new Repeated();
        System.out.println(result.repeatedString(s,n));
    }
}
