/*
 * You have two strings of lowercase English letters. You can perform two types of operations on the first string:

Append a lowercase English letter to the end of the string.
Delete the last character of the string. Performing this operation on an empty string results in an empty string.
Given an integer, , and two strings,  and , determine whether or not you can convert  to  by performing exactly  of the above operations on . If it's possible, print Yes. Otherwise, print No.

Example. 


To convert  to , we first delete all of the characters in  moves. Next we add each of the characters of  in order. On the  move, you will have the matching string. Return Yes.

If there were more moves available, they could have been eliminated by performing multiple deletions on an empty string. If there were fewer than  moves, we would not have succeeded in creating the new string.

Function Description

Complete the appendAndDelete function in the editor below. It should return a string, either Yes or No.

appendAndDelete has the following parameter(s):

string s: the initial string
string t: the desired string
int k: the exact number of operations that must be performed
Returns

string: either Yes or No
Input Format

The first line contains a string , the initial string.
The second line contains a string , the desired final string.
The third line contains an integer , the number of operations.

Constraints

 and  consist of lowercase English letters, .
Sample Input 0

hackerhappy
hackerrank
9
Sample Output 0

Yes
Explanation 0

We perform  delete operations to reduce string  to hacker. Next, we perform  append operations (i.e., r, a, n, and k), to get hackerrank. Because we were able to convert  to  by performing exactly  operations, we return Yes.

Sample Input 1

aba
aba
7
Sample Output 1

Yes
Explanation 1

We perform  delete operations to reduce string  to the empty string. Recall that though the string will be empty after  deletions, we can still perform a delete operation on an empty string to get the empty string. Next, we perform  append operations (i.e., a, b, and a). Because we were able to convert  to  by performing exactly  operations, we return Yes.

Sample Input 2

ashley
ash
2
Sample Output 2

No
 * 
 */
import java.util.*;
class Append{
 public  String appendAndDelete(String s, String t, int k) {
        if(s.equals(t))return "Yes";
        int temp=0,count=0;
        int n1=s.length(),n2=t.length();
        
        for(int i=0;i<n1 && i<n2;i++){
            if(s.charAt(i) != t.charAt(i)){
                temp=i+1;
                break;
            }
            if(n1<n2)return "No";
            temp=i;
        }
        count=(n1-temp)+(n2-temp);
    return (count<=k)?"Yes":"No";
    }

}

public class AppendandDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String s=in.next();
		System.out.print("Enter the second string : ");
		String t=in.next();
		System.out.print("Enter the maximun times to process : ");
		int k=in.nextInt();
		Append append=new Append();
		System.out.println(append.appendAndDelete(s, t, k));

	}

}
