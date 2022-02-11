import java.util.*;
//declaring another class
class Resul{
	//Declaring method to check and print
   public void plusMinus(int []arr) {
       float positive=0,negative=0,zero=0;
		    for(int index=0;index<arr.length;index++){
		        if(arr[index]>0){
		            positive++;
		        }
		        else if(arr[index]<0){
		             negative++;
		        }
		            else if(arr[index]==0){
		                  zero++;
		            }
		    }
		    positive=positive/arr.length;
		    negative=negative/arr.length;
		    zero=zero/arr.length;
		    System.out.print("No of positive elements is divide by array size then value is :  ");
			System.out.println(String.format("%.6f",positive));
			System.out.print("No of negative elements is divide by array size then value is :  ");
			System.out.println(String.format("%.6f",negative));
			System.out.print("No of zero elements is divide by array size then value is :  ");
			System.out.println(String.format("%.6f",zero));
   }
}
// Main class
public class PlusMinus {
	// Main Method
	public static void main(String[] args) {
		// declaring object for Scanner class
		 Scanner in=new Scanner(System.in);
		 //Initialize the size if array
		 System.out.print("Enter the size of array : ");
	        int size=in.nextInt();
	      //Initialize the array and size for array
	        int array[]=new int[size];
	        System.out.println("Enter the elements of array : ");
	        for(int index=0;index<size;index++){
	            array[index]=in.nextInt();
	        }
	        Resul res=new Resul();
	            res.plusMinus(array);
	}

}
