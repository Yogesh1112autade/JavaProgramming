package StringsMethod;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InStringRemoveDuplicatesAndReturnIt {
	public static String RemoveDuplicates(String name1) {
		StringBuilder sb=new StringBuilder();
		Set set1 = new HashSet<>();
		// Set<Character> set = new HashSet<>();
		
		for(char ch:name1.toCharArray()) {
			if(!set1.contains(ch)) {
			set1.add(ch);
			sb.append(ch);
			}
		}
		return sb.toString();
	}
     public static void main(String[] args) {
		
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter String:");
    	 String name=sc.nextLine();
    	 System.out.println("String with Duplicates:"+name);
    	 System.out.println("String without Duplicats:"+RemoveDuplicates(name));
    	 
	}

}
