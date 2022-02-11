package Problems;

/*Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. 
She tabulates the number of times she breaks her season record for most points and least points in a game.
 Points scored in the first game establish her record for the season, and she begins counting from there.

Example

Scores are in the same order as the games played. She tabulates her results as follows:
Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
     
     Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

Function Description

Complete the breakingRecords function in the editor below.

breakingRecords has the following parameter(s):

int scores[n]: points scored per game
Returns

int[2]: An array with the numbers of times she broke her records. Index 0 is for breaking most points records, and index 1 is for breaking least points records.

 
 Sample Input 0

9
10 5 20 20 4 5 2 25 1

Sample Output 0

2 4
     
*/

import java.util.*;
// The class use to find maximum score and minimum score from  given record
class MaxMin {
	// This method execute the process and passing array of score as parameter to this function
    public int[] breakingRecords(int score[]) {
    	// Initializing the array for return maximum count and minimum count
        int[] maxmin=new int[2];
     // Initializing the integers for store maximum value minimum value and counts
        int max=score[0],min=score[0],maxcount=0,mincount=0;
        for(int index=1;index<score.length;index++){
        	//The statement execute when it find maximum value and increase count
            if(score[index]>max){
                max=score[index];
                maxcount++;
            }
          //The statement execute when it find maximum value and increase count
            if(score[index]<min){
                min=score[index];
                mincount++;
            }
            // Storing the maximum count at 0 index
            // Storing the minimum count at 1 index
            maxmin[0]=maxcount;
            maxmin[1]=mincount;
        }
return maxmin;
    }

}
//Declaring main class
public class BreakingRecords {
	 //Declaring main method
	public static void main(String[] args) {
		   //creating object for scanner class
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        	int size=in.nextInt();
        System.out.println("Enter the elements of array : ");
         	int score[]=new int[size];
		         for(int index=0;index<size;index++){
		             score[index]=in.nextInt();
		         }
		// Creating object for MaxMin class
         MaxMin maxmin=new MaxMin();
         	//Storing the returned value count array
         	int count[]=maxmin.breakingRecords(score);
         		//Printing the output
         			System.out.println("Maximuncount " + " Minimumcount");
			         for(int index=0;index<count.length;index++){
			             System.out.print(count[index]+"              ");
			         }
	}

}
