import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to check whether it is Armstrong number or not : ");
		int number=input.nextInt();
		int a,sum=0,temp=number;
		while(number>0){
			a=number%10;
			sum=sum+(a*a*a);
			number=number/10;
		}
		if(temp==sum) {
			System.out.println(temp+" given number is Armstrong number");
		}
		else {
			System.out.println(temp+" given number is not a Armstrong number");
		}
	}

}
