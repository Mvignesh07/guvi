package navanee;
import java.util.*;
public class count {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("The count of number is"+count);
		s.close();
}
}
