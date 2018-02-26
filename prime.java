package navanee;
import java.util.*;
public class prime {
	public static void main(String args[]){    
		  int i,m=0,temp=0;      
		  System.out.println("Enter the given number");     
		  Scanner s =new Scanner(System.in);
		  int n=s.nextInt();
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println("Given number "+n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println("given number "+n+" is not prime number");      
		     temp=1;      
		     break;      
		    }      
		   }      
		   if(temp==0)  { System.out.println("Given number"+n+" is prime number"); }  
		  } 
		  s.close();
		} 
}
