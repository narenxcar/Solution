import java.util.*;
public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int arr[][]=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int r=0,l=0;
        int i=0,j=0;
        while(i<a){
            l+=arr[i][j];
            i++;
            j++;
        }
        i=0;j=a-1;
        while(i<a){
            r+=arr[i][j];
            i++;j--;
        }
        System.out.println(Math.abs(l-r));

	}

}
