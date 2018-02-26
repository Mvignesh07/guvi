package navanee;

import java.util.*;

public class palindrome {
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	  int n=s.nextInt();
	  int r,sum=0,temp;    
	  temp=n;    
	  while(n>0){    
	   r=n%10;
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println(" this is palindrome number ");    
	  else    
	   System.out.println("this is not palindrome");    
	  s.close();
	}  
	}  
