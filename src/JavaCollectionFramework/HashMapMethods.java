package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapMethods {
	public static void main(String[] args) {
		
		//HashMap m=new HashMap();
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		// add elements
		m.put(101,"Yogesh");
		m.put(102,"Vikas");
		m.put(103, "Asha");
		m.put(104, "Manisha");
		System.out.println(m);
		
		// get specific elements
		System.out.println(m.get(103));
		
		// remove pair from HashMap
		m.remove(102);
		System.out.println(m);
		
		// check key is present or not
		System.out.println(m.containsKey(104));
		
		// check value is present or not
		System.out.println(m.containsValue("Shubhangi"));
		
		//return all the keys as set
		System.out.println(m.keySet());
		
		//return all the as collection
		System.out.println(m.values());
		
		// return all the entries as set
		System.out.println(m.entrySet());
		
		for(Object o:m.keySet()) {
			System.out.println(o +"         "+m.get(o));
		}
		
		//Entry Methods
		//****************
		for(Map.Entry entry : m.entrySet()) {
			System.out.println(entry.getKey()+"      "+entry.getValue());
		}
		
	}

}
