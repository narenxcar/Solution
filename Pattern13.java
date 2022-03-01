/*
 * 		      
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
 
 * 			
 */
import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<=n;i++){
		    for(int j=n;j>=i;j--){
		        System.out.print(" ");
		    }int temp=1;
		    for(int k=1;k<=i;k++){
		        System.out.print(temp+" ");
		        temp=temp*(i-k)/k;
		    }
		    System.out.println();
		}
		}
	}

