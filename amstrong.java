package navanee;

import java.util.*;

public class amstrong {
	  public static void main(String[] args)  { 
		  Scanner s =new Scanner(System.in);
			System.out.println(" Enter number:");
			int n=s.nextInt();
		    int c=0,a,temp;  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("Yes it is armstrong number");   
		    else  
		        System.out.println("No it is Not armstrong number");   
	s.close();
}
}
