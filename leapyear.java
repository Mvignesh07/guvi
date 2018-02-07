package navanee;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter year");
		int a=s.nextInt();
		if(a%4==0){
			System.out.println("the give year is " +a+ "leapyear");
		}
		else{
			System.out.println("the give year is" +a+ "non-leapyear");
		}
		s.close();
	}
}
