/*
 * 
 * Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.

Function Description

Complete the beautifulDays function in the editor below.

beautifulDays has the following parameter(s):

int i: the starting day number
int j: the ending day number
int k: the divisor
Returns

int: the number of beautiful days in the range
Input Format

A single line of three space-separated integers describing the respective values of , , and .

Constraints

Sample Input

20 23 6
Sample Output
	20-2 18%6 == 0 32 - 23 9
2
Explanation

Lily may go to the movies on days , , , and . We perform the following calculations to determine which days are beautiful:

Day  is beautiful because the following evaluates to a whole number: 
Day  is not beautiful because the following doesn't evaluate to a whole number: 
Day  is beautiful because the following evaluates to a whole number: 
Day  is not beautiful because the following doesn't evaluate to a whole number: 
Only two days,  and , in this interval are beautiful. Thus, we print  as our answer.


 */
import java.util.*;
class Days{
    public static int beautifulDays(int i, int j, int k) {
        int count=0;
        for(int index=i;index<=j;index++){
            int temp=0,n=index;
            while(n>0){
                int r=n%10;
                temp=(temp*10)+r;
                n/=10;
            }
          temp=Math.abs(index-temp);
            if(temp%k==0)count++;
        }
        return count;
    }

}
public class BeautifulDaysMovies {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter the starting element :");
	       int starting=in.nextInt();
	       System.out.println("Enter the ending element :");
	       int ending=in.nextInt();
	       System.out.println("Enter the divisor element :");
	       int divisor=in.nextInt();
	       Days day=new Days();
	       System.out.println(day.beautifulDays(starting,ending,divisor));
	    }
	}