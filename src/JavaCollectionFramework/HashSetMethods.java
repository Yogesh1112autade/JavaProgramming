package JavaCollectionFramework;

import java.util.HashSet;

public class HashSetMethods {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		HashSet hs1=new HashSet();
		hs1.add(4);
		hs1.add(5);
		hs1.add(2);
		hs1.add(6);
		
//		hs.addAll(hs1);
//		System.out.println("Union:"+hs);
//		
//		hs.retainAll(hs1);
//		System.out.println("Intersection:"+hs);
		
		hs.removeAll(hs1);
		System.out.println("Differenc:"+hs);
	}

}
