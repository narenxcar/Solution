package Programs;
/*
 * 		narendran
n = 9
        n         
        a         
        r         
        e         				
n a r e n d r a n 
        d         
        r         
        a         
        n         
        
        
  naren
n = 5
    n     
    a     
n a r e n 
    e     
    n     
    
    
    s   
    i   
s i v a 
    a   


 */
import java.util.*;
public class Stringpluspattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=s.length();
		
		System.out.println("n = "+n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2) {
					System.out.print(s.charAt(i)+" ");
				}
					else if(i==n/2) {
						System.out.print(s.charAt(j)+" ");
					}
					else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
