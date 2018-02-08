package navanee;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the n Number");
		int n=s.nextInt();
		int i=1;
		int num=0;
		int total=0;
		while(i<=n){
			System.out.println("Enter the given number");
			int sum=s.nextInt();
			sum=sum+num;
			num=sum;
			i++;
			total=sum;
		}
		System.out.println("The Sum of number is"+total);
		s.close();
	}		
}
