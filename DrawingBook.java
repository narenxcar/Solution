/*
 * 
 * A teacher asks the class to open their books to a page number. A student can either start turning pages from the front of the book or from the back of the book. They always turn pages one at a time. When they open the book, page  is always on the right side:

image

When they flip page , they see pages  and . Each page except the last page will always be printed on both sides. The last page may only be printed on the front, given the length of the book. If the book is  pages long, and a student wants to turn to page , what is the minimum number of pages to turn? They can start at the beginning or the end of the book.

Given  and , find and print the minimum number of pages that must be turned in order to arrive at page .

Example



Untitled Diagram(4).png

Using the diagram above, if the student wants to get to page , they open the book to page , flip  page and they are on the correct page. If they open the book to the last page, page , they turn  page and are at the correct page. Return .

Function Description

Complete the pageCount function in the editor below.

pageCount has the following parameter(s):

int n: the number of pages in the book
int p: the page number to turn to
Returns

int: the minimum number of pages to turn
Input Format

The first line contains an integer , the number of pages in the book.
The second line contains an integer, , the page to turn to.

Constraints

Sample Input 0

6
2
Sample Output 0

1
Explanation 0

If the student starts turning from page , they only need to turn  page:

Untitled Diagram(6).png

If a student starts turning from page , they need to turn  pages:

Untitled Diagram(3).png

Return the minimum value, .

Sample Input 1

5
4
Sample Output 1

0
Explanation 1

If the student starts turning from page , they need to turn  pages:

Untitled Diagram(4).png

If they start turning from page , they do not need to turn any pages:

Untitled Diagram(5).png

Return the minimum value, .
 */


import java.util.*;
//Creating another class for make execution
class Book {
	//create method for count pages 
    public static int pageCount(int page, int open) {
    	//page is divided by 2 because each page contain 2 sides
        page/=2;
        // open page is we must visit that page that which in book so it too divided by 2
        open/=2;
        //to find no of count we should turn pages so the result is initialized
        int result=page-open;
        //for forwards of turning pages opne is lesses in case reverse turn book result is less 
        return (open>result)?result:open;
    }
}
//Declaring main class
public class DrawingBook {
	//Declaring main method
	public static void main(String[] args) {
		//crating object for scanner class
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the total number of pages in a book : ");
		//Initializing pages integer for getting input from user
        int page=in.nextInt();
		System.out.print("Enter pages number you should open : ");
		//Initializing open integer for getting input from user
        int open=in.nextInt();
        //creating object for Book class
        Book book=new Book();
        System.out.print("You should trun ");
      //passing argument for method and it return the value
        System.out.print(book.pageCount(page,open)+" to visite "+open);

	}

}
