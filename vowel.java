package navanee;

import java.util.Scanner;

public class vowel {
	public static void main(String[] args) {
		Scanner test =new Scanner(System.in);
		char ch=test.next( ).charAt(0);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println("The given albhabet is Vowel");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("Tdhe given albhabet is Consonant ");
		}
		else {
			System.out.println("The is not an Alphabet");
		}
		test.close();
	}
}
