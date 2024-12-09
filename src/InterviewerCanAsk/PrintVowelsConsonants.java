package InterviewerCanAsk;

import java.util.Scanner;

public class PrintVowelsConsonants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String name=sc.next();
		
		char [] array=new char[10];
		int v=0;
		int c=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				v++;
			}else {
				c++;
			}
		}
		System.out.println("Vowels:"+v);
		System.out.println("Consonants:"+c);
	}

}
