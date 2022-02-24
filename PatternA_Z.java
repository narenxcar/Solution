/*
1  
A  B  
1  2  3  
A  B  C  D  
1  2  3  4  5  
A  B  C  D  E  F  
1  2  3  4  5  6  7  
A  B  C  D  E  F  G  H  
1  2  3  4  5  6  7  8  9  
A  B  C  D  E  F  G  H  I  J   
1  2  3  4  5  6  7  8  9  10  11  
A  B  C  D  E  F  G  H  I  J   K   L   
1  2  3  4  5  6  7  8  9  10  11  12  13  
A  B  C  D  E  F  G  H  I  J   K   L   M   N   
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  
A  B  C  D  E  F  G  H  I  J   K   L   M   N   O   P   
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  
A  B  C  D  E  F  G  H  I  J   K   L   M   N   O   P   Q   R   
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  
A  B  C  D  E  F  G  H  I  J   K   L   M   N   O   P   Q   R   S   T   
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  
A  B  C  D  E  F  G  H  I  J   K   L   M   N   O   P   Q   R   S   T   U   V   
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  
A  B  C  D  E  F  G  H  I  J   K   L   M   N   O   P   Q   R   S   T   U   V   W   X   
1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  
A  B  C  D  E  F  G  H  I  J   K   L   M   N   O   P   Q   R   S   T   U   V   W   X   Y   Z   

 */
package Problems;

public class PatternA_Z {
public	static void main(String[] args) {
	for(int i=1;i<=26;i++) {
		for (int j=1;j<=i;j++){
			if(i%2==0) {
				System.out.print((char)(j+64)+"  ");
			}else {
				System.out.print(j+"  ");
			}
			if(j>=10 && i%2==0) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
