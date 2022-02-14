/*
 * 
 * There is a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , determine the number of words in .

Example

There are  words in the string: 'one', 'Two', 'Three'.

Function Description

Complete the camelcase function in the editor below.

camelcase has the following parameter(s):

string s: the string to analyze
Returns

int: the number of words in 
Input Format

A single line containing string .

Constraints

Sample Input

saveChangesInTheEditor
Sample Output

5
Explanation

String  contains five words:

save
Changes
In
The
Editor
 */
import java.util.*;
//Declaring another class Words
class Words{
	//Declaring the method for to find number of words
    public int camelcase(String s) {
    	//if String is empty return 0
    if(s=="")return 0;
    //Initialize result 1 because the string not empty atleast it must be one word
    int result=1;
    //loop use to travel at last element of string
    for(int index=0;index<s.length();index++){
    	//In case any capital letter occurs make one increment
        if(s.charAt(index)>='A' && s.charAt(index)<='Z'){
            result++;
        }
    }
    //loop over final value stored in result so return loop
    return result;
    }

}
//Declaring main class
public class CamelCase {
//Declaring main method
	public static void main(String[] args) {
		//create object for Scanner class
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter the line to count CamelCase words : ");
		 //get input from string from user as line
	       String words=in.nextLine();
	       //Create an object for Words class
	        Words letters=new Words();
	       System.out.print("There number of words in CamelCase is : ");
	       //pass the parameter to the method then it return the value
	       System.out.println(letters.camelcase(words));

	}

}
