package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InListUseIterator {
	public static void main(String args[]) {
		List<String> list=new ArrayList<>();
		list.add("Yogesh");
		list.add("Asha");
		list.add("Vikas");
		list.add("Manisha");
		
		Iterator<String> it=list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
