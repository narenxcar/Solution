import java.util.*;
class Tree {
    public static int utopianTree(int n) {
        int sum=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=sum;
            }else{
                sum++;
            }
        }
    return sum;
    }

}
public class UtopianTree {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of years : ");
		int n=in.nextInt();
		Tree tree=new Tree();
		System.out.print("The height of tree is : ");
		System.out.print(tree.utopianTree(n));
		
	}

}
