package JavaCollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMethods2 {
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add('A');
		list.add('O');
		list.add('E');
		list.add('Z');
		
		//sort the list
		Collections.sort(list);
        System.out.println("Sort list:"+list);
        //shuffle Element
        Collections.shuffle(list);
        System.out.println("Shuffle list:"+list);
        
        //reverse order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse order:"+list);
	}

}
