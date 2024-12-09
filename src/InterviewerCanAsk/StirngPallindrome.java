package InterviewerCanAsk;

import java.util.Scanner;

public class StirngPallindrome {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String name=sc.nextLine();
		String rev="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			rev= ch + rev;
		}
		if(name.equals(rev)) {
			System.out.println("String is pallindrome");
		}else {
			System.out.println("String is not pallindrome");
		}
		System.out.println("Reverse String:"+rev);
	}

}
