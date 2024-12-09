package JavaCollectionFramework;

import java.util.Hashtable;
import java.util.Map;

public class HashTableMethods {
  public static void main(String[] args) {
	
	  //Hashtable table=new Hashtable();
	  
	 Hashtable<Integer,String> table=new Hashtable<Integer,String>();
	  table.put(1, "Yogesh");
	  table.put(2,"Vikas");
	  table.put(3, "Asha");
	  table.put(4, "Manisha");
	  
	  for( int k : table.keySet()) {
		  System.out.println(k);
	  }
	  for(Map.Entry entry:table.entrySet()) {
		  System.out.println(entry.getKey()+"      "+entry.getValue());
	  }
}
}
