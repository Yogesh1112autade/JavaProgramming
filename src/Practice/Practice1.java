package Practice;

import java.util.HashMap;
import java.util.Scanner;

  public class Practice1{
	  public static void countChar(String name) {
		  HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		  
		  for(int i=0;i<name.length();i++) {
			  char ch=name.charAt(i);
			  if(map.containsKey(ch)) {
				  map.put(ch, map.get(ch)+1);
			  }
			  else {
				  map.put(ch, 1);
			  }
		  }
		  for(char ch:map.keySet()) {
			  System.out.println(ch+"="+map.get(ch));
		  }
	  }
	  
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String val=sc.nextLine();
		 
		countChar(val);
		
	}
	  
  }