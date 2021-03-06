/*Your local library needs your help! Given the expected and actual return dates for a library book,
 create a program that calculates the fine (if any). The fee structure is as follows:

    If the book is returned on or before the expected return date, no fine will be charged (i.e.: 

.
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date,
.
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the
.
If the book is returned after the calendar year in which it was expected, there is a fixed fine of

    .

Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be

.

Example

The first values are the return date and the second are the due date. The years are the same and the months are the same. The book is days late. Return

.

Function Description

Complete the libraryFine function in the editor below.

libraryFine has the following parameter(s):

    d1, m1, y1: returned date day, month and year, each an integer
    d2, m2, y2: due date day, month and year, each an integer

Returns

    int: the amount of the fine or 

    if there is none

Input Format

The first line contains
space-separated integers, , denoting the respective , , and on which the book was returned.
The second line contains space-separated integers, , denoting the respective , , and

on which the book was due to be returned.

Constraints

Sample Input

9 6 2015
6 6 2015

Sample Output

45
*/

import java.util.*;
class Fine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    	int y,m,d;
        if(y1>y2) {
            y=y1-y2;
            return y*10000;
        }        
        else if(m2<m1 && y2<=y1) {
            m=m1-m2;
            return m*500;
        }
        else if(d2<d1 && m2<=m1 && y2<=y1) {
            d=d1-d2;
            return d*15;
        }else   return 0;
    }

}

public class LibraryFine {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int d1,d2,m1,m2,y1,y2;
        System.out.println("Enter the date month year you returned book :");
        d1=in.nextInt();
        m1=in.nextInt();
        y1=in.nextInt();
        System.out.println("Enter the date month year you returned book before :");
        d2=in.nextInt();
        m2=in.nextInt();
        y2=in.nextInt();
        Fine result=new Fine();
        System.out.println("Your fine for dealy return book is : ");
        System.out.println(result.libraryFine(d1,m1,y1,d2,m2,y2));
    }
}
