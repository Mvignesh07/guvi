package guvi;
import java.util.*;
public class countString {
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		String  s=a.next();
		int count = 1;
           
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ')||(s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}

