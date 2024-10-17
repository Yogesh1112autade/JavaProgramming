package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
	   
		List<String> Fruits=new ArrayList<>();
		
		 Fruits.add("mango");
		 Fruits.add("banana");
		 Fruits.add("kiwi");
		 Fruits.add("Papaya");
		 
		 for(int i=0;i< Fruits.size();i++) {
			 System.out.println("fruits is:"+ Fruits.get(i));
		 }
		 for(String fruit: Fruits) {
			 System.out.println("For each loop:"+fruit);
		 }

	}

}
