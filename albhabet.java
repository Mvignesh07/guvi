package navanee;

import java.util.Scanner;

public class albhabet {
	public static void main(String[] args) {
		Scanner test1 =new Scanner(System.in);
		char ch=test1.next( ).charAt(0);
		if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("The given character albhabet");
		}
		else {
			System.out.println("The given is not albhabet");
		}
		test1.close();
	}
}
