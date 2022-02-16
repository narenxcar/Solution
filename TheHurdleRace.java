/*A video player plays a game in which the character competes in a hurdle race. Hurdles are of varying heights, and the characters have a maximum height they can jump. There is a magic potion they can take that will increase their maximum jump height by  unit for each dose. How many doses of the potion must the character take to be able to jump all of the hurdles. If the character can already clear all of the hurdles, return .

Example


The character can jump  unit high initially and must take  doses of potion to be able to jump all of the hurdles.

Function Description

Complete the hurdleRace function in the editor below.

hurdleRace has the following parameter(s):

int k: the height the character can jump naturally
int height[n]: the heights of each hurdle
Returns

int: the minimum number of doses required, always  or more
Input Format

The first line contains two space-separated integers  and , the number of hurdles and the maximum height the character can jump naturally.
The second line contains  space-separated integers  where .

Constraints

Sample Input 0

5 4
1 6 3 5 2
Sample Output 0

2
Explanation 0

Dan's character can jump a maximum of  units, but the tallest hurdle has a height of :

image

To be able to jump all the hurdles, Dan must drink  doses.

Sample Input 1

5 7
2 5 4 5 2
Sample Output 1

0
*/

import java.util.*;
class Race {
    public int hurdleRace(int k, int max) {
    return (k>max)?0:max-k;
    }

}
public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
        int size=in.nextInt();
        System.out.print("Enter the jump he can : ");
        int jump=in.nextInt();
        int max=0;
        System.out.println("Enter the element of array : ");
        for(int index=0;index<size;index++){
            int a=in.nextInt();
            max=(max<a)?a:max;
        }
        Race race=new Race();
        System.out.print(race.hurdleRace(jump,max));
    }
}
