package navanee;
import java.util.*;
public class oddeven {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0) {
			System.out.println("the give number is Even");
		}
		else{
			System.out.println("the give number is Odd");
		}
		s.close();
	}
}
