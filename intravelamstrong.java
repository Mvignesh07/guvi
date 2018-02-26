package navanee;

import java.util.Scanner;

public class intravelamstrong {
	    public static void main(String args[])
	    {
	        int n, n1, n2, i, rem, temp, count=0;
	        Scanner scan = new Scanner(System.in);	        			
	        System.out.print("Enter Starting Number :  ");
	        n1 = scan.nextInt();
	        System.out.print("Enter Ending Number :  ");
	        n2 = scan.nextInt();
	        for(i=n1+1; i<n2; i++)
	        {
	            temp = i;
	            n = 0;
	            while(temp != 0)
	            {
	                rem = temp%10;
	                n = n + rem*rem*rem;
	                temp = temp/10;
	            }
	            if(i == n)
	            {
	                if(count == 0)
	                {
	                    System.out.print("Armstrong number are: \n");
	                }
	                System.out.print(i + "  ");
	                count++;
	            }
	        }
	        if(count == 0)
	        {
	            System.out.print("Not amstrong number");
	        }
	        scan.close();
	    }
	}
