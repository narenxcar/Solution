/*
 *  
 * You wish to buy video games from the famous online video game store Mist.

Usually, all games are sold at the same price,  
dollars. However, they are planning to have the seasonal Halloween Sale next month in which you can buy games at a cheaper price.
 Specifically, the first game will cost  dollars, and every subsequent game will cost  dollars less than the previous one. This continues until the cost becomes less than or equal to  dollars, after which every game will cost  dollars. How many games can you buy during the Halloween Sale?

Example



.

The following are the costs of the first , in order:

Start at  units cost, reduce that by  units each iteration until reaching a minimum possible price, . Starting with  units of currency in your Mist wallet, you can buy 5 games: .

Function Description

Complete the howManyGames function in the editor below.

howManyGames has the following parameters:

int p: the price of the first game
int d: the discount from the previous game price
int m: the minimum cost of a game
int s: the starting budget
Input Format

The first and only line of input contains four space-separated integers , ,  and .

Constraints

Sample Input 0

20 3 6 80
Sample Output 0

6
Explanation 0
	20 17 14 11 8 6 6 6 6 6 6 6 6 
	20+17+14+11+8+6=76   
	count =6
Assumptions other than starting funds, , match the example in the problem statement. With a budget of , you can buy  games at a cost of . A  game for an additional  units exceeds the budget.

Sample Input 1

20 3 6 85
Sample Output 1

7
Explanation 1

This is the same as the previous case, except this time the starting budget  units of currency. This time, you can buy  games since they cost . An additional game at  units will exceed the budget.
 */
import java.util.*;
class Sale{
public int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy
	 int sum=0,count=-1;
	    while(sum<=s){
	            sum+=(p>m)?p:m;
	            p-=d;
	            count++;
	        }
	    return count;
	    }
	
   /* int sum=0,count=-1;
    while(sum<=s){
        if(p>m){
            sum+=p;
            p-=d;
            count++;
        }else{
            sum+=m;
            count++;
        }
    }
    return count;*/
    

}
public class HalloweenSale {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("The price of the first game : ");
		int p=in.nextInt();
		System.out.print("The price make discount for next all games : ");
		int d=in.nextInt();
		System.out.print("The price of the minimum cost of game : ");
		int m=in.nextInt();
		System.out.print("The budget game : ");
		int b=in.nextInt();
		Sale sale=new Sale();
		System.out.print("The total items of games you brought : ");
		System.out.print(sale.howManyGames(p,d,m,b));
	}

}
