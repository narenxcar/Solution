/*
 * 
 * Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
Example


This password is 5 characters long and is missing an uppercase and a special character. The minimum number of characters to add is .


This password is 5 characters long and has at least one of each character type. The minimum number of characters to add is .

Function Description

Complete the minimumNumber function in the editor below.

minimumNumber has the following parameters:

int n: the length of the password
string password: the password to test
Returns

int: the minimum number of characters to add
Input Format

The first line contains an integer , the length of the password.

The second line contains the password string. Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.

Constraints

All characters in  are in [a-z], [A-Z], [0-9], or [!@#$%^&*()-+ ].
Sample Input 0

3
Ab1
Sample Output 0

3
Explanation 0

She can make the password strong by adding  characters, for example, $hk, turning the password into Ab1$hk which is strong.

 characters aren't enough since the length must be at least .

Sample Input 1

11
#HackerRank
Sample Output 1

1
Explanation 1

The password isn't strong, but she can make it strong by adding a single digit.
 */
import java.util.*;
import java.lang.*;
class Password{
	public static int stringpassword(int n, String password) {
        int lower=0,upper=0,digit=0,special=0;
    for(int index=0;index<n;index++){
        char a=password.charAt(index);
        if(Character.isDigit(a))digit=1;
        else if(Character.isUpperCase(a))upper=1;
        else if(Character.isLowerCase(a))lower=1;
        else special=1;
    }
   int total=4;
    total=total-upper-digit-special-lower;     
        if(total+n<6)
            return 6-n;
        else
          return total;

    }

}
public class StringPassword {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the password length : ");
		int n=in.nextInt();
		System.out.print("Enter the password : ");
		String password=in.next();
		Password pass=new Password();
		System.out.println(pass.stringpassword(n,password));

	}

}
