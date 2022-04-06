import java.util.*;
public class Triplets {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size=in.nextInt();
		System.out.println("Enter the elements of array ");
		int[] input=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=in.nextInt();
		}
			
		LinkedHashSet<List<Integer>> result=new LinkedHashSet<>();
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				for(int k=j+1;k<size;k++) {
					if(input[i]+input[j]+input[k]==0) {
						ArrayList<Integer> array=new ArrayList<Integer>();
						array.add(input[i]);
						array.add(input[j]);
						array.add(input[k]);
						Collections.sort(array);
						result.add(array);
					}
				}
			}
		}
		System.out.print(result);
	}

}
