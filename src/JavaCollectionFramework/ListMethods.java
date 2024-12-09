package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(50);
		list.add(14);
		//ascending order
		Collections.sort(list);
		System.out.println(list);
		
		//desending order
		 Collections.sort(list, Comparator.reverseOrder());
		 System.out.println(list);
	}

}
