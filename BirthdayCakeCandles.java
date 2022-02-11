import java.util.*;
//Declare another class
class Final {
    //Declare method to find higher one and  number of count
    public static int birthdayCakeCandles(int arr[]) {
        int max=0,count=0;
    for(int index=0;index<arr.length;index++){
        if(arr[index]>max){
            max=arr[index];
        }
    }
    for(int index=0;index<arr.length;index++){
    if(arr[index]==max){
        count++;
    }
    }
    return count;
    }

}
public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the object for Scanner class
	       Scanner in=new Scanner(System.in);
	       System.out.print("Enter the array size : ");
	       int noof=in.nextInt();
	       int candles[]=new int[noof];
	       System.out.println("Enter the elements of array : ");
	       for(int index=0;index<noof;index++){
	           candles[index]=in.nextInt();
	       }
	       Final res=new Final();
	       int result=res.birthdayCakeCandles(candles);
	       System.out.println("The tallest candle count is : ");
	       System.out.println(result);
	}

}
