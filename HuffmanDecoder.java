import java.util.*;
public class HuffmanDecoder {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the values : ");
		String code=in.next();
		String temp="",result="";
		for(int index=0;index<code.length();index++) {
			temp+=code.charAt(index);
			if(temp.equals("1111")) {
				result+='E';
				temp="";
			}
			if(code.charAt(index)=='0') {
				if(temp.equals("0")) {
					result+='A';
				}else if(temp.equals("10")) {
					result+='B';
				}else if(temp.equals("110")) {
					result+='C';
				}else if(temp.equals("1110")) {
					result+='D';
				}
				temp="";
			}
		}
		System.out.print("Huffman Decodeed value is  : ");
		System.out.println(result);
	}

}
