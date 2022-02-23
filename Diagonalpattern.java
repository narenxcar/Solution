package Programs;

/*
pattern
p     p
 a   a 
  t t  
   t   
  e e  
 r   r 
n     n

  */
import java.util.*;
public class Diagonalpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=s.length();
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n-1;j++) {
				if(i==j||j==n-1-i) {
					System.out.print(s.charAt(k));
				}
				else System.out.print(" ");
			}
			System.out.println();
			k++;
		}
	}

}
