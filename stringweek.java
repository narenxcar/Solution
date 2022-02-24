/*
 * 
 * A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

Example

The string contains all letters in the English alphabet, so return pangram.

Function Description

Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.

pangrams has the following parameter(s):

string s: a string to test
Returns

string: either pangram or not pangram
Input Format

A single line with string .

Constraints


Each character of , 

Sample Input

Sample Input 0

We promptly judged antique ivory buckles for the next prize

Sample Output 0

pangram

Sample Explanation 0

All of the letters of the alphabet are present in the string.

Sample Input 1

We promptly judged antique ivory buckles for the prize

Sample Output 1

not pangram

Sample Explanation 0

The string lacks an x.
 */
import java.util.*;
class stringprogramer{
public static String pangrams(String s) {
        int[] count=new int[26];
        int n=s.length();
        int a=0;
        for (int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
             a=((int)c)-97;
            }else if(c>='A' && c<='Z'){
                a=((int)c)-65;
            }
            count[a]++;
        }
        for(int i=0;i<26;i++){
            if(count[i]==0){
                return "not pangram";
            }
        }
        return "pangram";
    }

}

public class stringweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.next();
		stringprogramer pro=new stringprogramer();
		System.out.println(pro.pangrams(s));
	}

}
