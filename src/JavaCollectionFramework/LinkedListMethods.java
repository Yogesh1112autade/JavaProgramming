package JavaCollectionFramework;

import java.util.LinkedList;

public class LinkedListMethods {
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.add("Yogesh");
		list.add(20);
		list.add(true);
		list.add("vikas");
		System.out.println(list);
		// romove element
		list.remove("vikas");
		System.out.println(list);
		//Adding or Inserting element
		list.add(3,"Java");
		System.out.println(list);
		//Retriveing the value
		System.out.println(list.get(2));
		//Change the value
		list.set(2, "Manisha");
		
		System.out.println(list);
		
	}

}
