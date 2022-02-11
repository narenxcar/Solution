import java.util.*;
// Another class to compare arrays
class Result{
	//method use to compare arrays and it return values as array
    public int[] compare(int a[],int b[]){
        int result[]=new int[2];
        for(int index=0;index<3;index++){
            if(a[index] != b[index]){
                if(a[index]>b[index]){
                    result[0]=result[0]+1;
                }
                else{
                    result[1]=result[1]+1;
                }
            }
        }
        return result;
    }
}
// Main class
public class CompareTheArrays {
	//Main method
	public static void main(String[] args) {
		//Declaring two arrays
		int alice[]=new int[3];
        int bob[]=new int[3];
        // creating object for Scanner class
   Scanner in=new Scanner(System.in);
   			// getting inputs for first array
   		System.out.println("Enter the first elements of array to compare ");
        for(int index=0;index<3;index++){
            alice[index]=in.nextInt();
        }
        	// getting input for second array
        System.out.println("Enter the Second elements of array to compare ");
        for(int index=0;index<3;index++){
            bob[index]=in.nextInt();
        }
        // creating object for Result class
   Result res=new Result();
   // Declare new array to get return integer from Result class
     int award[]=new int[2];
     // pass two array values to compare method that method return the another to award array
     award=res.compare(alice,bob);
     // It print the out put
        for(int index=0;index<award.length;index++){
            System.out.print(award[index]+" ");
        }
	}

}
