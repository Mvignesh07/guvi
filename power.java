package navanee;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		System.out.println("Enter the given number");
		Scanner pow =new Scanner(System.in);
		int a=pow.nextInt();
			a=a*a;
			System.out.println("the power number is"+a);
		
		pow.close();
     }
}
