package navanee;

import java.util.Scanner;

public class largestthree {
	public static void main(String[] args) {
		Scanner test2 =new Scanner(System.in);
		int a=test2.nextInt();
		int b=test2.nextInt();
		int c=test2.nextInt();
		if((a>b && a>c)){
			System.out.println("The largest number is"+a);
		}
		else if(b>a && b>c){
			System.out.println("The largest number is"+b);
		}
		else {
			System.out.println("The largest number is"+c);
		}
		test2.close();
	}
}
