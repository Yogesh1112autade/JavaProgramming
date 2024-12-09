package InterviewerCanAsk;

import java.util.Scanner;

class Hello{
	public String ReverseString1(String s) {
		String nstr="";
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			nstr=ch + nstr;
		}
		return nstr;
	}
	public String ReverseString2(String s) {
		String nstr="";
		for(int i=0,k=s.length();i<=s.length()-1;i++,k--) {
			char ch=s.charAt(k);
			nstr=nstr + ch;
		}
		return nstr;
	}
	public String StringBuilder(String name) {
	         StringBuilder s=new StringBuilder(name);
	         s.reverse();
	         return s.toString();
	}
	
}
public class ReverseStringDifferentMethods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String name=sc.nextLine();
		
		Hello h=new Hello();
				String name1=h.ReverseString1(name);
				System.out.println("Reverse String 1:"+name1);
				String name2=h.ReverseString1(name);
				System.out.println("Reverse String 2:"+name2);
				
				String name3=h.StringBuilder(name);
				System.out.println("String Reverse Using String Builder:"+name3);
	}

}
