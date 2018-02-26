package navanee;

import java.util.*;
public class factorial{
	public static void main(String[] args) { 
	Scanner s =new Scanner(System.in);
	  System.out.println("Enter the number");
	int n=s.nextInt();
	int fact = 1,i=1;
	 while(i<=n){
		 fact=fact*i;
		 i++;
	 }
	   System.out.println("Factorial of number "+n+" is: "+fact);
	 s.close();
	}
}
