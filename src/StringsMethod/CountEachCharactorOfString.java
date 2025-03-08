package StringsMethod;

import java.util.HashMap;

public class CountEachCharactorOfString {
	
	public static void CountEachCharactor(String name) {
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		 
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		for(char key:map.keySet()) {
		System.out.println(key+"="+map.get(key));
		}
	}
	public static void main(String[] args) {
		String name="Hello";
		CountEachCharactor(name);
	}

}
