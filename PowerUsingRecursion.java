import java.util.*;
public class PowerUsingRecursion {
	static float power(float b,int p){
        if(p==0)return 1;
        return b*power(b,p-1);
    }
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Base value that to power : ");
		float base=input.nextFloat();
		System.out.print("Enter the Power value : ");
		int power=input.nextInt();
		System.out.print(base+" is power by "+power+" is : ");
		System.out.print(power(base,power));
	}
}
